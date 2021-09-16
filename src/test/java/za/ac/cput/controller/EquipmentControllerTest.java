package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Equipment;
import za.ac.cput.factory.EquipmentFactory;
import static org.junit.jupiter.api.Assertions.*;
/* EquipmentControllerTest.java
Controller test for the EquipmentController
Author: Lilitha Moni (219068429)
Date:16 August 2021
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class EquipmentControllerTest {

    private static Equipment equipment = EquipmentFactory.createEquipment("Tyrese","Skipping Rope", "1m long");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/equipment";

    @Test
    void a_create()
    {
        String url = baseURL+"/create";
        ResponseEntity<Equipment> postResponce = restTemplate.postForEntity(url,equipment,Equipment.class);
        assertNotNull(postResponce);
        assertNotNull(postResponce.getBody());
        assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
        equipment = postResponce.getBody();
        System.out.println("Saved data: "+equipment);
        assertEquals(equipment.getEqId(),postResponce.getBody().getEqId());
    }

    @Test
    void b_read()
    {
        String url = baseURL+"/read/"+equipment.getEqId();
        System.out.println("URL: "+url);
        ResponseEntity<Equipment> response = restTemplate.getForEntity(url, Equipment.class);
        assertEquals(equipment.getEqId(),response.getBody().getEqId());
    }

    @Test
    @Disabled
    void c_update()
    {
        Equipment updated = new Equipment.Builder().copy(equipment).setEqName("Skipping Rope").build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("Updated data: "+updated);
        ResponseEntity<Equipment> response = restTemplate.postForEntity(url,updated, Equipment.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete()
    {
        String url = baseURL+"/delete/"+equipment.getEqId() ;
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
        System.out.println("Equipment");
        System.out.println(repsonse);
        System.out.println(repsonse.getBody());



    }




}
