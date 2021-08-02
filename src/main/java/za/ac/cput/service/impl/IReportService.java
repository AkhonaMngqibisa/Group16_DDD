package za.ac.cput.service.impl;
/**
 IReportService.java
 Service: IReportService
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */


import za.ac.cput.entity.Report;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IReportService extends IService<Report, Integer> {
Set<Report> getAll();
}
