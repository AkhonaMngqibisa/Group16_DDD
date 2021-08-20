/* PayRollControllerTest.java
 * Class PayRollControllerTest for PayRoll.
 * Author: Bokang Molaoa [218131097]
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
import za.ac.cput.entity.PayRoll;
import za.ac.cput.factory.PayRollFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class PayRollControllerTest {
    private static PayRoll payRoll = PayRollFactory.createPayRoll(8000, "3330", "8");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/payRoll";

    @Test
    void a_create() {
        String url = baseURL+ "/create";
        ResponseEntity<PayRoll> postResponse = restTemplate.postForEntity(url, payRoll, PayRoll.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        payRoll = postResponse.getBody();
        System.out.println("DATA SAVED: "+ payRoll);
        assertEquals(payRoll.getPayrollID(), postResponse.getBody().getPayrollID());
    }

    @Test
    void b_read() {
        String url = baseURL+"/read/"+payRoll.getPayrollID();
        System.out.println("URL: "+url);
        ResponseEntity<PayRoll> response = restTemplate.getForEntity(url, PayRoll.class);
        assertNull(response.getBody());
    }

    @Test
    void c_update() {
        PayRoll updated = new PayRoll.Builder().copy(payRoll).setHours("8").build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("DATA UPDATED: " + updated);
        ResponseEntity<PayRoll> response = restTemplate.postForEntity(url,updated, PayRoll.class);
        assertNull(response.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL+"/delete/"+ payRoll.getPayrollID();
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
