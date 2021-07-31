package za.ac.cput.service.impl;
/**
 ReportServiceImpl.java
 Service: ReportServiceImpl
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */

import za.ac.cput.entity.Report;
import za.ac.cput.repository.impl.ReportRepository;

import java.util.Set;

public class ReportServiceImpl implements IReportService {

    public static IReportService iReportService = null;
    private ReportRepository reportRepository;

    private ReportServiceImpl(){
        this.reportRepository = (ReportRepository) ReportRepository.geReportRepository();
    }

        public static IReportService getReportService(){
        if(iReportService == null) {
            iReportService = new ReportServiceImpl();
        }
        return iReportService;
    }

    @Override
    public Report create(Report report) {
        return this.reportRepository.create(report);
    }

    @Override
    public Report read(Integer integer) {
        return this.reportRepository.read(integer);
    }

    @Override
    public Report update(Report report) {
        return this.reportRepository.update(report);
    }

    @Override
    public boolean delete(Integer integer) {
        return this.reportRepository.delete(integer);
    }

    @Override
    public Set<Report> getAll() {
        return this.reportRepository.getAll();
    }
}
