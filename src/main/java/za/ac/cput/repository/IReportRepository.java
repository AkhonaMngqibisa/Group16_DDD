package za.ac.cput.repository;

import za.ac.cput.entity.Report;

import java.util.Set;

public interface IReportRepository extends IRepository<Report, Integer> {
    Set<Report> getAll();
}