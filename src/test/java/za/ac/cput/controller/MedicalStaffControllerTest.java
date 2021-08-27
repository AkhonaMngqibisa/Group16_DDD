/* MedicalStaffControllerTest.java
 * Test for MedicalStaffController
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.factory.MedicalStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class MedicalStaffControllerTest {
    private final String baseURL = "http://localhost:8080/medicalstaff";

    private static MedicalStaff medicalStaff = MedicalStaffFactory.createMedicalStaff(
            "Jane",
            "Doe",
            "janedoe@medicalstaff.co.za",
            "0123456789"
    );

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void a_create()
    {
        String url = baseURL + "/create";
        ResponseEntity<MedicalStaff> postResponse =
                restTemplate.postForEntity(
                        url,
                        medicalStaff,
                        MedicalStaff.class
                );
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        medicalStaff = postResponse.getBody();
        System.out.println("Saved data\n----------\n" + medicalStaff);
    }

    @Test
    void b_read()
    {
        String url = baseURL + "/read/" + medicalStaff.getId();
        ResponseEntity<MedicalStaff> response =
                restTemplate.getForEntity(
                        url,
                        MedicalStaff.class
                );
        assertNotNull(response.getBody());
        assertEquals(medicalStaff.getId(), response.getBody().getId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update()
    {
        MedicalStaff updated =
                new MedicalStaff
                        .Builder(medicalStaff)
                        .setLastName("Odd")
                        .setEmail("janeodd@medicalstaff.co.za")
                        .build();
        String url = baseURL + "/update";
        ResponseEntity<MedicalStaff> response =
                restTemplate.postForEntity(
                        url,
                        updated,
                        MedicalStaff.class
                );
        assertNotNull(response.getBody());
        System.out.println("Updated data\n------------\n" + updated);
    }

    @Test
    void d_getAll()
    {
        String url = baseURL+"/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null, headers);
        ResponseEntity<String> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,
                        entity,
                        String.class
                );
        System.out.println("MedicalStaff");
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    void e_delete()
    {
        String urlDelete = baseURL + "/delete/" + medicalStaff.getId();
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
        String urlRead = baseURL + "/read/" + medicalStaff.getId();
        ResponseEntity<MedicalStaff> response =
                restTemplate.getForEntity(
                        urlRead,
                        MedicalStaff.class
                );
        assertNull(response.getBody());
    }
}
