package com.harington.upskilling.privateSchool.adapters.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harington.upskilling.privateSchool.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.ClasseJpaRepository;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Testcontainers
public class ClasseIntegrationTest {

    @Autowired
    private ObjectMapper mapper;

    private URI uri;

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Container
    @ServiceConnection
    @ClassRule
    public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:16.1");

    @Autowired
    ClasseJpaRepository classeJpaRepository;

    @Before
    public void setUp() throws URISyntaxException {
        classeJpaRepository.deleteAll();
        final String baseUrl = "http://localhost:" + port.toString() + "/v1/classes";
        uri = new URI(baseUrl);
    }

    @Test
    public void whenNewClasseCreated_thenGetShouldRetunrThatClasse() {
        CreateClasseRequest createClasseRequest = new CreateClasseRequest("CP1", "Niveau ! du primaire");
        HttpEntity<CreateRequest> request = new HttpEntity<>(createClasseRequest);
        ResponseEntity<String> response = this.testRestTemplate.postForEntity(uri, request, String.class);
        Assert.assertEquals(HttpStatusCode.valueOf(201), response.getStatusCode());

        String location = (String) response.getHeaders().get("location").get(0);
        ResponseEntity<Classe> result = this.testRestTemplate.getForEntity(location, Classe.class);
        Classe classe = result.getBody();
        Assert.assertEquals(createClasseRequest.libelle(), classe.libelle());
        Assert.assertEquals(classe.description(), createClasseRequest.description());
        Assert.assertTrue(classe.id() != 0);
    }
}
