package za.ac.cput.repository;
/**
 ReportRepositoryTest.java
 Repository: ReportRepositoryTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Report;
import za.ac.cput.factory.ReportFactory;
import za.ac.cput.repository.impl.IReportRepository;
import za.ac.cput.repository.impl.ReportRepository;

import static org.junit.jupiter.api.Assertions.*;

public class ReportRepositoryTest {
    private static IReportRepository reportRepository = ReportRepository.geReportRepository();
    private static Report report = ReportFactory.createReport(022,
            0021,
            "2021/03/16",
            "Weekly");

    @Test
    public void geReportRepository() {
    }

    @Test
    public void create() {
        Report report1 = reportRepository.create(reportRepository.create(report));
        assertEquals(report.getReportID(), report.getReportID());
        System.out.println("\nCreated: " + report);
    }

    @Test
    public void read() {
        Report read = reportRepository.read(report.getReportID());
        assertNotNull(read);
        System.out.println("\nTo String:\n" + read.toString());
    }

    @Test
    public void update() {
        Report report1 = new Report.Builder().copy(report).setReportID(045).
                setTrainerID(0015).setReportDate
                ("2021/08/26").setAttendance
                ("Monthly").build();
        report1 = reportRepository.update(report1);
        System.out.println("\nUpdated: " + report1);
    }

    @Test
    public void delete() {
        boolean deleteSuccessful = reportRepository.delete(report.getReportID());
        assertTrue(deleteSuccessful);
    }

    @Test
    public void getAll() {
        System.out.println("\nDisplay All: " + reportRepository.getAll());
    }
}