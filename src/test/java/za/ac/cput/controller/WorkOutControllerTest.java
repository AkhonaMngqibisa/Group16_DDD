package za.ac.cput.controller;
//Hlumelo Mpotulo
//215226348

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.factory.WorkOutFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

class WorkOutControllerTest {

    private final String baseURL = "http://localhost:8080/WorkOut";
    private static WorkOut workOut = WorkOutFactory.createWorkOut(5765, "Push Ups", "xxxxxxxxxxxxxxxxx");
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<WorkOut> postResponse =
                restTemplate.postForEntity(
                        url,
                        workOut,
                        WorkOut.class

                );
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        workOut = postResponse.getBody();
        System.out.println("Saved data\n----------\n" + workOut);
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + workOut.getWorkoutId();
        ResponseEntity<WorkOut> response =
                restTemplate.getForEntity(
                        url,
                        WorkOut.class
                );
        assertNotNull(response.getBody());
        assertEquals(workOut.getWorkoutId(), response.getBody().getWorkoutId());
        System.out.println(response.getBody());
    }
    @Test
    void c_update()
    {
        WorkOut updated =
                new WorkOut
                        .Builder()
                        .setWorkoutId(46546)
                        .setWorkoutName("Push Ups")
                        .setWorkoutDescription("xxxxxxxxxxxxxxxxxx")
                        .build();
        String url = baseURL + "/update";
        ResponseEntity<WorkOut> response =
                restTemplate.postForEntity(
                        url,
                        updated,
                        WorkOut.class
                );
        assertNotNull(response.getBody());
        System.out.println("Updated data\n------------\n" + updated);
    }
    @Test
    void e_delete()
    {
        String urlDelete = baseURL + "/delete/" + workOut.getWorkoutId();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null, headers);
        ResponseEntity<Boolean> isDeleted =
                restTemplate.exchange(
                        urlDelete,
                        HttpMethod.DELETE,
                        entity,
                        boolean.class
                );
        assertNotNull(isDeleted.getBody());
        assertTrue(isDeleted.getBody());
        String urlRead = baseURL + "/read/" + workOut.getWorkoutId();
        ResponseEntity<WorkOut> response =
                restTemplate.getForEntity(
                        urlRead,
                        WorkOut.class
                );
        assertNull(response.getBody());
    }

    @Test
    void d_getAll()
    {
        String url = baseURL+"/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null, headers);
        ResponseEntity<String> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,
                        entity,
                        String.class
                );
        System.out.println("WorkOut");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}