package za.ac.cput.repository.impl;

/**
 ReportRepository.java
 Repository: ReportRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.entity.Report;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/*public class ReportRepository implements IReportRepository {
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

    @Override
    public List<Report> findAll() {
        return null;
    }

    @Override
    public List<Report> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Report> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Report> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Report report) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Report> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Report> S save(S s) {
        return null;
    }

    @Override
    public <S extends Report> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Report> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Report> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Report> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Report> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Report getOne(Integer integer) {
        return null;
    }

    @Override
    public Report getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Report> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Report> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Report> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Report> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Report> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Report> boolean exists(Example<S> example) {
        return false;
    }
}

 */
