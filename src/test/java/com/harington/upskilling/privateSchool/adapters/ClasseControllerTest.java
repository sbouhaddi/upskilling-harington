package com.harington.upskilling.privateSchool.adapters;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.domain.exceptions.RecordNotFoundException;
import com.harington.upskilling.privateSchool.domain.model.Classe;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.ClasseController;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.exceptionHandler.ApiErrorResponse;
import com.harington.upskilling.privateSchool.infrastrcuture.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@Import(SecurityConfig.class)
@WebMvcTest(controllers = {ClasseController.class})
public class ClasseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final ObjectMapper mapper = new ObjectMapper();

    @MockBean
    private ClasseUseCase classeUseCase;

    @WithMockUser(
            username = "any",
            password = "any",
            roles = {"any"})
    @Test
    public void whenPostValidClasseInput_thenReturn201AndLocationHeader() throws JsonProcessingException, Exception {

        CreateClasseRequest classeRequest = new CreateClasseRequest("CP1", "Niveau 1 primaire");

        when(classeUseCase.create(classeRequest))
                .thenReturn(new Classe(classeRequest.libelle(), classeRequest.description()));

        mockMvc.perform(MockMvcRequestBuilders.post("/v1/classes")
                        .content(mapper.writeValueAsString(classeRequest))
                        .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.header().exists("location"));

        ArgumentCaptor<CreateClasseRequest> classeCaptor = ArgumentCaptor.forClass(CreateClasseRequest.class);
        verify(classeUseCase, times(1)).create(classeCaptor.capture());

        CreateClasseRequest capturedClasseRequest = classeCaptor.getValue();
        assertEquals(capturedClasseRequest.libelle(), classeRequest.libelle());
        assertEquals(capturedClasseRequest.description(), classeRequest.description());
    }

    @WithMockUser(
            username = "any",
            password = "any",
            roles = {"any"})
    @Test
    public void whenGetByExintingId_then200AndDataIsReturn() throws JsonProcessingException, Exception {

        when(classeUseCase.get(1000)).thenReturn(new Classe(1000, "CP1", "Niveau 1 primaire"));

        MvcResult result = mockMvc.perform(
                        MockMvcRequestBuilders.get("/v1/classes/{id}", 1000).contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String responseContent = result.getResponse().getContentAsString();
        Classe response = mapper.readValue(responseContent, Classe.class);
        assertEquals(1000, response.id());
        assertEquals("CP1", response.libelle());
        assertEquals("Niveau 1 primaire", response.description());

        ArgumentCaptor<Long> classeCaptor = ArgumentCaptor.forClass(Long.class);
        verify(classeUseCase, times(1)).get(classeCaptor.capture());
    }

    @Test
    @WithMockUser(
            username = "admin",
            password = "admin",
            roles = {"USER"})
    public void whenGetNotExistingClasse_thenReturnNotFoundResponseError() throws JsonProcessingException, Exception {
        when(classeUseCase.get(1000)).thenThrow(new RecordNotFoundException("Classe introuvable"));

        MvcResult result = mockMvc.perform(
                        MockMvcRequestBuilders.get("/v1/classes/{id}", 1000).contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andReturn();

        String responseContent = result.getResponse().getContentAsString();
        ApiErrorResponse errorResponse = mapper.readValue(responseContent, ApiErrorResponse.class);

        assertEquals(HttpStatus.NOT_FOUND.value(), errorResponse.statut());
        assertNotNull(errorResponse.message());

        ArgumentCaptor<Long> classeCaptor = ArgumentCaptor.forClass(Long.class);
        verify(classeUseCase, times(1)).get(classeCaptor.capture());
    }
}
