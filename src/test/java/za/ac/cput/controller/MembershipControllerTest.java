/* MembershipControllerTest.java
 * Test for MembershipController
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MemberFactory;
import za.ac.cput.factory.MembershipFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class MembershipControllerTest {
    private final String baseURL = "http://localhost:8080/membership";

    private static final Member member = MemberFactory.createMember(
            "John",
            "Doe",
            "24 Gym Road",
            "0123456789",
            22,
            "alive",
            "johndoe@personal.co.za",
            "*****"
    );
    private static Membership membership = MembershipFactory.createMembership(
            member,
            "silver",
            100.00
    );

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void a_create()
    {
        String url = baseURL + "/create";
        ResponseEntity<Membership> postResponse =
                restTemplate.postForEntity(
                        url,
                        membership,
                        Membership.class
                );
        System.out.println(postResponse);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        membership = postResponse.getBody();
        System.out.println("Saved data\n----------\n" + membership);
        assertEquals(membership.getId(), postResponse.getBody().getId());
    }

    @Test
    void b_read()
    {
        String url = baseURL + "/read/" + membership.getId();
        ResponseEntity<Membership> response =
                restTemplate.getForEntity(
                        url,
                        Membership.class
                );
        assertNotNull(response.getBody());
        assertEquals(membership.getId(), response.getBody().getId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update()
    {
        Membership updated =
                new Membership
                        .Builder(membership)
                        .setType("gold")
                        .build();
        String url = baseURL + "/update";
        ResponseEntity<Membership> response =
                restTemplate.postForEntity(
                        url,
                        updated,
                        Membership.class
                );
        assertNotNull(response.getBody());
        System.out.println("Updated data\n------------\n" + updated);
    }

    @Test
    void d_getAll()
    {
        String url = baseURL+"/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null,headers);
        ResponseEntity<String> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,entity,
                        String.class
                );
        System.out.println("Membership");
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    void e_delete()
    {
        String urlDelete = baseURL + "/delete/" + membership.getId();
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
        String urlRead = baseURL + "/read/" + membership.getId();
        ResponseEntity<MedicalStaff> response =
                restTemplate.getForEntity(
                        urlRead,
                        MedicalStaff.class
                );
        assertNull(response.getBody());
    }
}
