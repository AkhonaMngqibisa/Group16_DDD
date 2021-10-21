package za.ac.cput.service.impl;
/**
 ReportServiceTest.java
 Service: ReportServiceTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 02 July 2021
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Report;
import za.ac.cput.factory.ReportFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class ReportServiceImplTest {
    @Autowired
    private static ReportServiceImpl reportServiceImp;
    private static Report report = ReportFactory.createReport(022,
            0021,
            "2021/03/16",
            "Weekly");

    @Test
    void getReportService() {
    }

    @Test
    void create() {
        Report report1 = reportServiceImp.create(reportServiceImp.create(report));
        assertEquals(report.getReportID(), report.getReportID());
        System.out.println("\nCreated: " + report);
    }

    @Test
    @Disabled
    void read() {
        Report read = reportServiceImp.read(report.getReportID());
        System.out.println("\nTo String:\n" + read);
    }

    @Test
    @Disabled
    void update() {
        Report report1 = new Report.Builder().copy(report).setReportID(045).
                setTrainerID(0015).setReportDate
                ("2021/08/26").setAttendance
                ("Daily").build();
        report1 = reportServiceImp.update(report1);
        System.out.println("\nUpdated: " + report1);
    }

    @Test
    @Disabled
    void delete() {
        boolean deleteSuccessful = reportServiceImp.delete(report.getReportID());
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    public void getAll() {
        Set<Report> reportSet = reportServiceImp.getAll();
        System.out.println("\nDisplay All: " + reportSet);
    }
}