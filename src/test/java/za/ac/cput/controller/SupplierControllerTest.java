package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Supplier;
import za.ac.cput.factory.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;
/* SupplierControllerTest.java
Controller test for the SupplierController
Author: Lilitha Moni (219068429)
Date:16 August 2021
*/
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class SupplierControllerTest {

    private static Supplier supplier = SupplierFactory.createSupplier("Zandile", 542);

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/supplier";

    @Test
    void a_create()
    {
        String url = baseURL+"/create";
        ResponseEntity<Supplier> postResponce = restTemplate.postForEntity(url,supplier,Supplier.class);
        assertNotNull(postResponce);
        assertNotNull(postResponce.getBody());
        assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
        supplier = postResponce.getBody();
        System.out.println("Saved data: "+supplier);
        assertEquals(supplier.getSupId(),postResponce.getBody().getSupId());
    }

    @Test
    void b_read()
    {
        String url = baseURL+"/read/"+supplier.getSupId();
        System.out.println("URL: "+url);
        ResponseEntity<Supplier> response = restTemplate.getForEntity(url, Supplier.class);
        assertEquals(supplier.getSupId(),response.getBody().getSupId());
    }

    @Test
    @Disabled
    void c_update()
    {
        Supplier updated = new Supplier.Builder().copy(supplier).setSupName("Tyrese").build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("Updated data: "+updated);
        ResponseEntity<Supplier> response = restTemplate.postForEntity(url,updated, Supplier.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete()
    {
        String url = baseURL+"/delete/"+supplier.getSupId() ;
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
        System.out.println("Supplier");
        System.out.println(repsonse);
        System.out.println(repsonse.getBody());



    }




}
