package za.ac.cput.service.impl;
/**
 ReportServiceImpl.java
 Service: ReportServiceImpl
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Report;
import za.ac.cput.repository.impl.IReportRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements IReportService {

    public static IReportService iReportService = null;
    @Autowired
    private IReportRepository iReportRepository;

    @Override
    public Report create(Report report) {
        return this.iReportRepository.save(report);
    }

    @Override
    public Report read(Integer reportId) {
        return this.iReportRepository.findById(reportId).orElse(null);
    }

    @Override
    public Report update(Report report) {
        if(this.iReportRepository.existsById(report.getReportID()))
        this.iReportRepository.save(report);
        return report;
    }

    @Override
    public boolean delete(Integer reportId) {
        this.iReportRepository.deleteById(reportId);
        return !this.iReportRepository.existsById(reportId);
    }

    @Override
    public Set<Report> getAll() {
        return this.iReportRepository.findAll().stream().collect(Collectors.toSet());
    }
}
