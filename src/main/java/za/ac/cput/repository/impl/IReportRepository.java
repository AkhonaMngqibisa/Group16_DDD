package za.ac.cput.repository.impl;

import za.ac.cput.entity.Report;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IReportRepository extends IRepository<Report, Integer> {
    Set<Report> getAll();
}