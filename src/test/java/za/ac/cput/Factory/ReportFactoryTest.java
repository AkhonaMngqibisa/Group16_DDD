package za.ac.cput.Factory;
/**
 FactoryTest: Report
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Report;

import static org.junit.jupiter.api.Assertions.*;

class ReportFactoryTest {

    @Test
    void createReport() {
        Report report = ReportFactory.createReport(022,
                0021,
                "2021/03/16",
                "Weekly");

        Assert.assertEquals(report, report);
    }
}