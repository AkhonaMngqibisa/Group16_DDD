/* TrainerControllerTest.java
 * Class TrainerControllerTest for Trainer.
 * Author:Bokang Molaoa [218131097]
 * Date: 15 August 2021.
 */
package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Trainer;
import za.ac.cput.factory.TrainerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class TrainerControllerTest {
    private static Trainer trainer = TrainerFactory.createTrainer("Alunamda", "Nkomo", "0644588551",
            "50 Gea", "Alu@gmail.com", "A@ll2050");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/trainer";

    @Test
    void a_create() {
        String url = baseURL+"/create";
        ResponseEntity<Trainer> postResponse = restTemplate.postForEntity(url,trainer,Trainer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        trainer = postResponse.getBody();
        System.out.println("DATA SAVED: "+ trainer);
        assertEquals(trainer.getTrainerID(),postResponse.getBody().getTrainerID());
    }

    @Test
    void b_read() {
        String url = baseURL+"/read/"+ trainer.getTrainerID();
        System.out.println("URL: "+url);
        ResponseEntity<Trainer> response = restTemplate.getForEntity(url, Trainer.class);
        assertEquals(trainer.getTrainerID(),response.getBody().getTrainerID());
    }

    @Test
    void c_update() {
        Trainer updated = new Trainer.Builder().copy(trainer).setTrainerID(trainer.getTrainerID()).build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("DATA UPDATED: " + updated);
        ResponseEntity<Trainer> response = restTemplate.postForEntity(url,updated, Trainer.class);
        assertNotNull(response.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL+"/delete/"+ trainer.getTrainerID();
        System.out.println("URL: "+url);
        restTemplate.delete(url);
    }

    @Test
    void d_getAll() {
        String url = baseURL+"/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("PayRoll");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
