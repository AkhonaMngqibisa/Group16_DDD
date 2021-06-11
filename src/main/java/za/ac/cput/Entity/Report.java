package za.ac.cput.Entity;

import java.util.Objects;
/**
 Report.java
 Entity: Report
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */

public class Report {
    private int reportID, trainerID;
    private String reportDate;
    private String attendance;


    private Report(Builder builder) {
        this.reportID = builder.reportID;
        this.trainerID = builder.trainerID;
        this.reportDate = builder.reportDate;
        this.attendance = builder.attendance;
    }

    protected Report() {

    }

    public int getReportID() {
        return reportID;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getAttendance() {
        return attendance;
    }

    public void CalcAttendence(long workoutScheduleCode) {
        /*
         * Attendance is based on
         * number of registered workout
         * days
         */
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportID=" + reportID +
                ", trainerID=" + trainerID +
                ", reportDate=" + reportDate +
                ", attendance='" + attendance + '\'' +
                '}';
    }

    public static class Builder
    {
        private int reportID, trainerID;
        private String reportDate;
        private String attendance;

        public Builder setReportID(int reportID) {
            this.reportID = reportID;
            return this;
        }

        public Builder setTrainerID(int trainerID) {
            this.trainerID = trainerID;
            return this;
        }

        public Builder setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }

        public Builder setAttendance(String attendance) {
            this.attendance = attendance;
            return this;
        }

        public Report.Builder copy(Report r) {
            this.reportID = r.reportID;
            this.trainerID = r.trainerID;
            this.reportDate = r.reportDate;
            this.attendance = r.attendance;
            return this;
        }

        public Report build() {
            return new Report(this);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Report report = (Report) o;
            return reportID == report.reportID;
        }

        @Override
        public int hashCode() {
            return Objects.hash(reportID);
        }
    }
}
