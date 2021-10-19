package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.PackageFactory;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
class PackageControllerTest {
    private static Package aPackage = PackageFactory.createPackage(025,
            800.00,
            "Mega Package");

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String baseURL = "http://localhost:8080/package";

    @Test
    void create() {
        String url = baseURL+"/create";
        System.out.println(url);

        ResponseEntity<Package> postResponseEntity = restTemplate.postForEntity(url, aPackage,Package.class);
        assertNotNull(postResponseEntity);
        assertNotNull(postResponseEntity.getBody());
        assertEquals(postResponseEntity.getStatusCode(), HttpStatus.OK);
        aPackage = postResponseEntity.getBody();

        System.out.println(aPackage);
        assertEquals(aPackage.getPackageID(),postResponseEntity.getBody().getPackageID());
    }

    @Test
    void read() {
        String url = baseURL + "read/" + aPackage.getPackageID();
        System.out.println(url);

        ResponseEntity<Package> readResponseEntity = restTemplate.getForEntity(url, Package.class);
        assertEquals(aPackage.getPackageID(), readResponseEntity.getBody().getPackageID());

        System.out.println(readResponseEntity);
        System.out.println(readResponseEntity.getBody());
    }

    @Test
    @Disabled
    void update() {
        Package aPackage1 = new Package.Builder().copy(aPackage).setPackageID(015).
                setMembershipID(025).setHoursPerWeek(8).setPrice(350.00).
                setPackageName("Medium Package").build();
        String url = baseURL+"/update";
        System.out.println(url);
        System.out.println("updated");
        ResponseEntity<Package> response = restTemplate.postForEntity(url,aPackage1, Package.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void delete() {
        String url = baseURL + "delete/" + aPackage.getPackageID();
        System.out.println("Deleted: "+url);
        restTemplate.delete(url);

        }

    @Test
    @Disabled
    void getAll() {
        String url = baseURL + "all/";
        System.out.println(url);

        org.springframework.http.HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity =  new HttpEntity<>(null,headers);
        ResponseEntity<String> getAllResponseEntity = restTemplate.exchange(url, HttpMethod.GET,entity, String.class);

        System.out.println(getAllResponseEntity);
        System.out.println(getAllResponseEntity.getBody());

    }
}