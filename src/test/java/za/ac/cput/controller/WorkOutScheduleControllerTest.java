package za.ac.cput.controller;

//Hlumelo Mpotulo
//215226348

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.factory.WorkOutScheduleFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

class WorkOutScheduleControllerTest {
    private final String baseURL = "http://localhost:8080/WorkOutSchedule";
    private static WorkOutSchedule workOutSchedule = WorkOutScheduleFactory.createWorkOutSchedule(
            4545,
            45454,
            45544,
            45545,
            "10 June 2021",
            "08h00"
    );
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<WorkOutSchedule> postResponse =
                restTemplate.postForEntity(
                        url,
                        workOutSchedule,
                        WorkOutSchedule.class

                );
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        workOutSchedule = postResponse.getBody();
        System.out.println("Saved data\n----------\n" + workOutSchedule);
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + WorkOutSchedule.getScheduleId();
        ResponseEntity<WorkOutSchedule> response =
                restTemplate.getForEntity(
                        url,
                        WorkOutSchedule.class
                );
        assertNotNull(response.getBody());
        assertEquals(WorkOutSchedule.getScheduleId(), response.getBody().getWorkoutId());
        System.out.println(response.getBody());
    }
    @Test
    void c_update()
    {
        WorkOutSchedule updated =
                new WorkOutSchedule
                        .Builder()
                        .setScheduleId(46546)
                        .setTrainerId(6776)
                        .setMemberId(6767)
                        .setWorkoutId(87)
                        .setWorkoutDate("18 October 2021")
                        .setWorkoutTime("02H03")
                        .build();
        String url = baseURL + "/update";
        ResponseEntity<WorkOutSchedule> response =
                restTemplate.postForEntity(
                        url,
                        updated,
                        WorkOutSchedule.class
                );
        assertNotNull(response.getBody());
        System.out.println("Updated data\n------------\n" + updated);
    }
    @Test
    void e_delete()
    {
        String urlDelete = baseURL + "/delete/" + WorkOutSchedule.getScheduleId();
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
        String urlRead = baseURL + "/read/" + WorkOutSchedule.getScheduleId();
        ResponseEntity<WorkOutSchedule> response =
                restTemplate.getForEntity(
                        urlRead,
                        WorkOutSchedule.class
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
        System.out.println("WorkOutSchedule");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
