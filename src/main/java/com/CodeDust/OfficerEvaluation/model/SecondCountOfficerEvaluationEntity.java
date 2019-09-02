package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "second_count_officer_evaluation", schema = "employee_performance_evaluation", catalog = "")
public class SecondCountOfficerEvaluationEntity {

    @Id
    @GeneratedValue
    private int secondCountOfficerEvaluationId;
    private String secondCountCommentsOnRepoOfficer;
    private String secondCountOfficerName;
    private byte[] secondCountOfficerSignature;
    private String secondCountOfficerDesignation;
    private Date secondCountOfficerDate;

    @Basic
    @Column(name = "Second_Count_Officer_Evaluation_Id", nullable = false)
    public int getSecondCountOfficerEvaluationId() {
        return secondCountOfficerEvaluationId;
    }

    public void setSecondCountOfficerEvaluationId(int secondCountOfficerEvaluationId) {
        this.secondCountOfficerEvaluationId = secondCountOfficerEvaluationId;
    }

    @Basic
    @Column(name = "Second_Count_Comments_On_Repo_Officer", nullable = true, length = 45)
    public String getSecondCountCommentsOnRepoOfficer() {
        return secondCountCommentsOnRepoOfficer;
    }

    public void setSecondCountCommentsOnRepoOfficer(String secondCountCommentsOnRepoOfficer) {
        this.secondCountCommentsOnRepoOfficer = secondCountCommentsOnRepoOfficer;
    }

    @Basic
    @Column(name = "Second_Count_Officer_Name", nullable = true, length = 45)
    public String getSecondCountOfficerName() {
        return secondCountOfficerName;
    }

    public void setSecondCountOfficerName(String secondCountOfficerName) {
        this.secondCountOfficerName = secondCountOfficerName;
    }

    @Basic
    @Column(name = "Second_Count_Officer_Signature", nullable = true)
    public byte[] getSecondCountOfficerSignature() {
        return secondCountOfficerSignature;
    }

    public void setSecondCountOfficerSignature(byte[] secondCountOfficerSignature) {
        this.secondCountOfficerSignature = secondCountOfficerSignature;
    }

    @Basic
    @Column(name = "Second_Count_Officer_Designation", nullable = true, length = 45)
    public String getSecondCountOfficerDesignation() {
        return secondCountOfficerDesignation;
    }

    public void setSecondCountOfficerDesignation(String secondCountOfficerDesignation) {
        this.secondCountOfficerDesignation = secondCountOfficerDesignation;
    }

    @Basic
    @Column(name = "Second_Count_Officer_Date", nullable = true)
    public Date getSecondCountOfficerDate() {
        return secondCountOfficerDate;
    }

    public void setSecondCountOfficerDate(Date secondCountOfficerDate) {
        this.secondCountOfficerDate = secondCountOfficerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondCountOfficerEvaluationEntity that = (SecondCountOfficerEvaluationEntity) o;
        return secondCountOfficerEvaluationId == that.secondCountOfficerEvaluationId &&
                Objects.equals(secondCountCommentsOnRepoOfficer, that.secondCountCommentsOnRepoOfficer) &&
                Objects.equals(secondCountOfficerName, that.secondCountOfficerName) &&
                Arrays.equals(secondCountOfficerSignature, that.secondCountOfficerSignature) &&
                Objects.equals(secondCountOfficerDesignation, that.secondCountOfficerDesignation) &&
                Objects.equals(secondCountOfficerDate, that.secondCountOfficerDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(secondCountOfficerEvaluationId, secondCountCommentsOnRepoOfficer, secondCountOfficerName, secondCountOfficerDesignation, secondCountOfficerDate);
        result = 31 * result + Arrays.hashCode(secondCountOfficerSignature);
        return result;
    }
}
