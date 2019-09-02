package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "reporting_officer_evaluation", schema = "employee_performance_evaluation", catalog = "")
public class ReportingOfficerEvaluationEntity {
    @Id
    @GeneratedValue
    private int reportingOfficerEvaluationId;
    private String empAttributeName;
    private String empAttributeGrade;
    private String empEvaluationComments;
    private String empEvaluationDetailComments;
    private String empEvaluationStrgWeakComments;
    private String reportingOfficerName;
    private byte[] reportingOfficerSignature;
    private String reportingOfficerDesignation;
    private Date reportingOfficerDate;


    @Column(name = "Reporting_Officer_Evaluation_Id", nullable = false)
    public int getReportingOfficerEvaluationId() {
        return reportingOfficerEvaluationId;
    }

    public void setReportingOfficerEvaluationId(int reportingOfficerEvaluationId) {
        this.reportingOfficerEvaluationId = reportingOfficerEvaluationId;
    }

    @Basic
    @Column(name = "Emp_Attribute_Name", nullable = true, length = 45)
    public String getEmpAttributeName() {
        return empAttributeName;
    }

    public void setEmpAttributeName(String empAttributeName) {
        this.empAttributeName = empAttributeName;
    }

    @Basic
    @Column(name = "Emp_Attribute_Grade", nullable = true, length = 45)
    public String getEmpAttributeGrade() {
        return empAttributeGrade;
    }

    public void setEmpAttributeGrade(String empAttributeGrade) {
        this.empAttributeGrade = empAttributeGrade;
    }

    @Basic
    @Column(name = "Emp_Evaluation_Comments", nullable = true, length = 45)
    public String getEmpEvaluationComments() {
        return empEvaluationComments;
    }

    public void setEmpEvaluationComments(String empEvaluationComments) {
        this.empEvaluationComments = empEvaluationComments;
    }

    @Basic
    @Column(name = "Emp_Evaluation_Detail_Comments", nullable = true, length = 45)
    public String getEmpEvaluationDetailComments() {
        return empEvaluationDetailComments;
    }

    public void setEmpEvaluationDetailComments(String empEvaluationDetailComments) {
        this.empEvaluationDetailComments = empEvaluationDetailComments;
    }

    @Basic
    @Column(name = "Emp_Evaluation_Strg_Weak_Comments", nullable = true, length = 45)
    public String getEmpEvaluationStrgWeakComments() {
        return empEvaluationStrgWeakComments;
    }

    public void setEmpEvaluationStrgWeakComments(String empEvaluationStrgWeakComments) {
        this.empEvaluationStrgWeakComments = empEvaluationStrgWeakComments;
    }

    @Basic
    @Column(name = "Reporting_Officer_Name", nullable = true, length = 45)
    public String getReportingOfficerName() {
        return reportingOfficerName;
    }

    public void setReportingOfficerName(String reportingOfficerName) {
        this.reportingOfficerName = reportingOfficerName;
    }

    @Basic
    @Column(name = "Reporting_Officer_Signature", nullable = true)
    public byte[] getReportingOfficerSignature() {
        return reportingOfficerSignature;
    }

    public void setReportingOfficerSignature(byte[] reportingOfficerSignature) {
        this.reportingOfficerSignature = reportingOfficerSignature;
    }

    @Basic
    @Column(name = "Reporting_Officer_Designation", nullable = true, length = 45)
    public String getReportingOfficerDesignation() {
        return reportingOfficerDesignation;
    }

    public void setReportingOfficerDesignation(String reportingOfficerDesignation) {
        this.reportingOfficerDesignation = reportingOfficerDesignation;
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
        ReportingOfficerEvaluationEntity that = (ReportingOfficerEvaluationEntity) o;
        return reportingOfficerEvaluationId == that.reportingOfficerEvaluationId &&
                Objects.equals(empAttributeName, that.empAttributeName) &&
                Objects.equals(empAttributeGrade, that.empAttributeGrade) &&
                Objects.equals(empEvaluationComments, that.empEvaluationComments) &&
                Objects.equals(empEvaluationDetailComments, that.empEvaluationDetailComments) &&
                Objects.equals(empEvaluationStrgWeakComments, that.empEvaluationStrgWeakComments) &&
                Objects.equals(reportingOfficerName, that.reportingOfficerName) &&
                Arrays.equals(reportingOfficerSignature, that.reportingOfficerSignature) &&
                Objects.equals(reportingOfficerDesignation, that.reportingOfficerDesignation) &&
                Objects.equals(reportingOfficerDate, that.reportingOfficerDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(reportingOfficerEvaluationId, empAttributeName, empAttributeGrade, empEvaluationComments, empEvaluationDetailComments, empEvaluationStrgWeakComments, reportingOfficerName, reportingOfficerDesignation, reportingOfficerDate);
        result = 31 * result + Arrays.hashCode(reportingOfficerSignature);
        return result;
    }
}
