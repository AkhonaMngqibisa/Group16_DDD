package za.ac.cput.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class AdminControllerTest {

    private static Admin admin = AdminFactory.creatAdmin("bongisa","Mpahleni","0781837656","216205999@mycput.ac.za");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/admin";

    @Test
    void a_create()
    {
        String url = baseURL+"/create";
        ResponseEntity<Admin> postResponce = restTemplate.postForEntity(url,admin,Admin.class);
        assertNotNull(postResponce);
        assertNotNull(postResponce.getBody());
        assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
        admin = postResponce.getBody();
        System.out.println("Saved data: "+admin);
        assertEquals(admin.getID(),postResponce.getBody().getID());
    }

    @Test
    void b_read()
    {
        String url = baseURL+"/read/"+admin.getID();
        System.out.println("URL: "+url);
        ResponseEntity<Admin> response = restTemplate.getForEntity(url, Admin.class);
        assertEquals(admin.getID(),response.getBody().getID();
    }

    @Test
    @Disabled
    void c_update()
    {
        Admin updated = new Admin().Builder().copy(admin).setLastName("Dr Mpahleni").build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("Updated data: "+updated);
        ResponseEntity<Admin> response = restTemplate.postForEntity(url,updated, Admin.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete()
    {
        String url = baseURL+"/delete/"+admin.getID() ;
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
        System.out.println("ALL MEMBERS");
        System.out.println(repsonse);
        System.out.println(repsonse.getBody());



    }
}