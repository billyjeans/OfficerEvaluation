package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "count_officer_evaluation", schema = "employee_performance_evaluation", catalog = "")
public class CountOfficerEvaluationEntity {
    private int countOfficerEvaluationId;
    private String countCommentsOnRepoOfficer;
    private String empAssesEvaluationRepoOfficer;
    private String countOfficerName;
    private byte[] countOfficerSignature;
    private String countOfficerDesignation;
    private Date reportingOfficerDate;

    @Id
    @GeneratedValue
    @Column(name = "Count_Officer_Evaluation_Id", nullable = false)
    public int getCountOfficerEvaluationId() {
        return countOfficerEvaluationId;
    }

    public void setCountOfficerEvaluationId(int countOfficerEvaluationId) {
        this.countOfficerEvaluationId = countOfficerEvaluationId;
    }

    @Basic
    @Column(name = "Count_Comments_On_Repo_Officer", nullable = true, length = 45)
    public String getCountCommentsOnRepoOfficer() {
        return countCommentsOnRepoOfficer;
    }

    public void setCountCommentsOnRepoOfficer(String countCommentsOnRepoOfficer) {
        this.countCommentsOnRepoOfficer = countCommentsOnRepoOfficer;
    }

    @Basic
    @Column(name = "Emp_Asses_Evaluation_Repo_Officer", nullable = true, length = 45)
    public String getEmpAssesEvaluationRepoOfficer() {
        return empAssesEvaluationRepoOfficer;
    }

    public void setEmpAssesEvaluationRepoOfficer(String empAssesEvaluationRepoOfficer) {
        this.empAssesEvaluationRepoOfficer = empAssesEvaluationRepoOfficer;
    }

    @Basic
    @Column(name = "Count_Officer_Name", nullable = true, length = 45)
    public String getCountOfficerName() {
        return countOfficerName;
    }

    public void setCountOfficerName(String countOfficerName) {
        this.countOfficerName = countOfficerName;
    }

    @Basic
    @Column(name = "Count_Officer_Signature", nullable = true)
    public byte[] getCountOfficerSignature() {
        return countOfficerSignature;
    }

    public void setCountOfficerSignature(byte[] countOfficerSignature) {
        this.countOfficerSignature = countOfficerSignature;
    }

    @Basic
    @Column(name = "Count_Officer_Designation", nullable = true, length = 45)
    public String getCountOfficerDesignation() {
        return countOfficerDesignation;
    }

    public void setCountOfficerDesignation(String countOfficerDesignation) {
        this.countOfficerDesignation = countOfficerDesignation;
    }

    @Basic
    @Column(name = "Reporting_Officer_Date", nullable = true)
    public Date getReportingOfficerDate() {
        return reportingOfficerDate;
    }

    public void setReportingOfficerDate(Date reportingOfficerDate) {
        this.reportingOfficerDate = reportingOfficerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountOfficerEvaluationEntity that = (CountOfficerEvaluationEntity) o;
        return countOfficerEvaluationId == that.countOfficerEvaluationId &&
                Objects.equals(countCommentsOnRepoOfficer, that.countCommentsOnRepoOfficer) &&
                Objects.equals(empAssesEvaluationRepoOfficer, that.empAssesEvaluationRepoOfficer) &&
                Objects.equals(countOfficerName, that.countOfficerName) &&
                Arrays.equals(countOfficerSignature, that.countOfficerSignature) &&
                Objects.equals(countOfficerDesignation, that.countOfficerDesignation) &&
                Objects.equals(reportingOfficerDate, that.reportingOfficerDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(countOfficerEvaluationId, countCommentsOnRepoOfficer, empAssesEvaluationRepoOfficer, countOfficerName, countOfficerDesignation, reportingOfficerDate);
        result = 31 * result + Arrays.hashCode(countOfficerSignature);
        return result;
    }
}
