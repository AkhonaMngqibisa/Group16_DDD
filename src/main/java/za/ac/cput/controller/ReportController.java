package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Report;
import za.ac.cput.factory.ReportFactory;
import za.ac.cput.service.impl.IReportService;

import java.util.Set;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private IReportService iReportService;

    @PostMapping("/create")
    public Report create(@RequestBody Report report) {
        Report report1 = ReportFactory.createReport(report.getReportID(), report.getTrainerID()
                ,report.getReportDate(),
                report.getAttendance());
        return iReportService.create(report);
    }
    @GetMapping("/read/{reportID}")
    public Report read(@PathVariable int reportID) {
        return iReportService.read(reportID);
    }
    @GetMapping("/update")
    public Report update(@RequestBody Report report){
        return iReportService.update(report);
                
    }
    @GetMapping("/delete/{reportID}")
    public boolean delete(@PathVariable int reportID){
        return iReportService.delete(reportID);
    }
    @GetMapping("/getAll")
    public Set<Report> getAll(){
        return iReportService.getAll();
    }
}
