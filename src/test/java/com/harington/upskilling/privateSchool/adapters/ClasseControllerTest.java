package com.harington.upskilling.privateSchool.adapters;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.ClasseController;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.exceptionHandler.RestExceptionHandler;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {ClasseController.class})
public class ClasseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeAll
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(ClasseController.class)
                .setControllerAdvice(new RestExceptionHandler())
                .build();
    }

    private final ObjectMapper mapper = new ObjectMapper();

    @MockBean
    private ClasseUseCase classeUseCase;

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
}
