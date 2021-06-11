package za.ac.cput.Factory;

import za.ac.cput.Entity.Report;

import java.util.Date;
/**
 Factory: Report
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */

public class ReportFactory {
    public static Report createReport(int reportID, int trainerID,
                                      String reportDate, String attendance) {
        return new Report.Builder().
                setReportID(reportID)
                .setTrainerID(trainerID)
                .setReportDate
                        (reportDate).setAttendance(attendance).build();
    }

}