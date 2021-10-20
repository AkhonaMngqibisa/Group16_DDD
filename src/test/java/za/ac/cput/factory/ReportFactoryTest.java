package za.ac.cput.factory;
/**
 FactoryTest: Report
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Report;


class ReportFactoryTest {

    @Test
    void createReport() {
        Report report = ReportFactory.createReport(022,
                0021,
                "2021/03/16",
                "Weekly");
        System.out.println(report);

        assertTrue(report instanceof Report);
    }
}