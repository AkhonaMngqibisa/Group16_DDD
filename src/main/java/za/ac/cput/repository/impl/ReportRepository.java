package za.ac.cput.repository.impl;

/**
 ReportRepository.java
 Repository: ReportRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import za.ac.cput.entity.Report;

import java.util.HashSet;
import java.util.Set;

public class ReportRepository implements IReportRepository {
    private static ReportRepository reportRepository = null;
    private Set<Report> reportSet;

    private ReportRepository() {
        this.reportSet = new HashSet<>();
    }

    public static IReportRepository geReportRepository() {
        if (reportRepository == null) {
            reportRepository = new ReportRepository();
        }
        return new ReportRepository();
    }

    @Override
    public Report create(Report report) {
        this.reportSet.add(report);
        return report;
    }

    @Override
    public Report read(Integer integer) {
        for (Report report : this.reportSet) {
            return report;
        }
        return null;
    }

    @Override
    public Report update(Report report) {
        Report report1 = read(report.getReportID());
            if (report1 != null)
                this.reportSet.remove(report1);
            this.reportSet.add(report);
            return report;
        }

    @Override
    public boolean delete(Integer integer) {
            Report report = read(integer);
            if (report != null) {
                this.reportSet.remove(report);
                return true;
            } else {
                return false;
            }
        }

    @Override
    public Set<Report> getAll() {
        return null;
    }
}
