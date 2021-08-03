package za.ac.cput.service.impl;
/**
 ReportServiceTest.java
 Service: ReportServiceTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 02 July 2021
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Report;
import za.ac.cput.factory.ReportFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class ReportServiceImplTest {

    private static ReportServiceImpl reportServiceImpl = (ReportServiceImpl) ReportServiceImpl.getReportService();
    private static Report report = ReportFactory.createReport(022,
            0021,
            "2021/03/16",
            "Weekly");

    @Test
    void getReportService() {
    }

    @Test
    void create() {
        Report report1 = reportServiceImpl.create(reportServiceImpl.create(report));
        assertEquals(report.getReportID(), report.getReportID());
        System.out.println("\nCreated: " + report);
    }

    @Test
    void read() {
        Report read = reportServiceImpl.read(report.getReportID());
        System.out.println("\nTo String:\n" + read);
    }

    @Test
    void update() {
        Report report1 = new Report.Builder().copy(report).setReportID(045).
                setTrainerID(0015).setReportDate
                ("2021/08/26").setAttendance
                ("Daily").build();
        report1 = reportServiceImpl.update(report1);
        System.out.println("\nUpdated: " + report1);
    }

    @Test
    void delete() {
        boolean deleteSuccessful = reportServiceImpl.delete(report.getReportID());
        assertTrue(deleteSuccessful);
    }

    @Test
    public void getAll() {
        Set<Report> reportSet = reportServiceImpl.getAll();
        System.out.println("\nDisplay All: " + reportSet);
    }
}