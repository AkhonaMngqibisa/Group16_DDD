package za.ac.cput.controller;

/* PaymentControllerTest.java
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class PaymentControllerTest {

    private static Payment payment = PaymentFactory.creatPayment(5000.00,"20 october 2021");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/member";

    @Test
    void a_create()
    {
        String url = baseURL+"/create";
        ResponseEntity<Payment> postResponce = restTemplate.postForEntity(url,payment,Payment.class);
        assertNotNull(postResponce);
        assertNotNull(postResponce.getBody());
        assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
        payment = postResponce.getBody();
        System.out.println("Saved data: "+payment);
        assertEquals(payment.getPaymentID(),postResponce.getBody().getPaymentID());
    }

    @Test
    void b_read()
    {
        String url = baseURL+"/read/"+payment.getPaymentID();
        System.out.println("URL: "+url);
        ResponseEntity<Payment> response = restTemplate.getForEntity(url, Payment.class);
        assertEquals(payment.getPaymentID(),response.getBody().getPaymentID());
    }

    @Test
    @Disabled
    void c_update()
    {
        Payment updated = new Payment.Builder().copy(payment).setPaymentAmount(10000.00).build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("Updated data: "+updated);
        ResponseEntity<Payment> response = restTemplate.postForEntity(url,updated, Payment.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete()
    {
        String url = baseURL+"/delete/"+payment.getPaymentID();
        System.out.println("URL: "+url);
        restTemplate.delete(url);

    }

    @Test
    @Disabled
    void d_getAll()
    {
        String url = baseURL+"/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null,headers);
        ResponseEntity<String> repsonse = restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("ALL Payments");
        System.out.println(repsonse);
        System.out.println(repsonse.getBody());



    }
}