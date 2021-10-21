package za.ac.cput.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Report;
import za.ac.cput.factory.ReportFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)

class ReportControllerTest {
    private static Report report = ReportFactory.createReport(022,
                0021,
                "2021/03/16",
                "Weekly");

        @Autowired
        private TestRestTemplate restTemplate;
        private static final String baseURL = "http://localhost:8080/report";

        @Test
        void create() {
            String url = baseURL+"/create";
            System.out.println(url);

            ResponseEntity<Report> postResponseEntity = restTemplate.postForEntity(url, report,Report.class);
            assertNotNull(postResponseEntity);
            assertNotNull(postResponseEntity.getBody());
            assertEquals(postResponseEntity.getStatusCode(), HttpStatus.OK);
            report = postResponseEntity.getBody();

            System.out.println(report);
            assertEquals(report.getReportID(),postResponseEntity.getBody().getReportID());
        }

    @Test
    void read() {
        String url = baseURL + "read/" + report.getReportID();
        System.out.println(url);

        ResponseEntity<Report> readResponseEntity = restTemplate.getForEntity(url, Report.class);
        assertEquals(report.getReportID(), readResponseEntity.getBody().getReportID());

        System.out.println(readResponseEntity);
        System.out.println(readResponseEntity.getBody());
    }

    @Test
    @Disabled
    void update() {
        Report report1 = new Report.Builder().copy(report).setReportID(045).
                setTrainerID(0015).setReportDate
                ("2021/08/26").setAttendance
                ("Daily").build();
        String url = baseURL+"/update";
        System.out.println(url);
        System.out.println("updated");
        ResponseEntity<Report> response = restTemplate.postForEntity(url,report1, Report.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void delete() {
        String url = baseURL + "delete/" + report.getReportID();
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