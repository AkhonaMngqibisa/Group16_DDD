package za.ac.cput.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Gym;
import za.ac.cput.factory.GymFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class GymControllerTest {

    private static Gym gym = GymFactory.createGym("BabZone","Ny1 No135 Gugulethu");
    public static  String SECURITY_USERNAME = "user";
    public static  String SECURITY_PASSWORD = "password";

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/gym";

    @Test
    void a_create()
    {
        String url = baseURL+"/create";
        ResponseEntity<Gym> postResponce = restTemplate.postForEntity(url,gym,Gym.class);
        assertNotNull(postResponce);
        assertNotNull(postResponce.getBody());
        assertEquals(postResponce.getStatusCode(), HttpStatus.OK);
        gym = postResponce.getBody();
        System.out.println("Saved data: "+gym);
        assertEquals(gym.getGymID(),postResponce.getBody().getGymID());
    }

    @Test
    void b_read()
    {
        String url = baseURL+"/read/"+gym.getGymID();
        System.out.println("URL: "+url);
        ResponseEntity<Gym> response = restTemplate.getForEntity(url, Gym.class);
        assertEquals(gym.getGymID(),response.getBody().getGymID());
    }

    @Test
    @Disabled
    void c_update()
    {
       Gym updated = new Gym.Builder().copy(gym).setGymAddress("Ny5 No165 Gugulethu").build();
        String url = baseURL+"/update";
        System.out.println("URL: "+url);
        System.out.println("Updated data: "+updated);
        ResponseEntity<Gym> response = restTemplate.postForEntity(url,updated, Gym.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void e_delete()
    {
        String url = baseURL+"/delete/"+gym.getGymID() ;
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
        ResponseEntity<String> repsonse = restTemplate.withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD).exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("Gym");
        System.out.println(repsonse);
        System.out.println(repsonse.getBody());



    }



}