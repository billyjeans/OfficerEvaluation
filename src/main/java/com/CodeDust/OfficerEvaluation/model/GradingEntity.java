package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "grading", schema = "employee_performance_evaluation", catalog = "")
public class GradingEntity {
    @Id
    @GeneratedValue
    private int gradingId;
    private String gradingAttribute;
    private String gradingValueRepoOfficer;
    private String gradingValueCountOfficer;

    @Id
    @Column(name = "Grading_Id", nullable = false)
    public int getGradingId() {
        return gradingId;
    }

    public void setGradingId(int gradingId) {
        this.gradingId = gradingId;
    }

    @Basic
    @Column(name = "Grading_Attribute", nullable = true, length = 45)
    public String getGradingAttribute() {
        return gradingAttribute;
    }

    public void setGradingAttribute(String gradingAttribute) {
        this.gradingAttribute = gradingAttribute;
    }

    @Basic
    @Column(name = "Grading_Value_Repo_Officer", nullable = true, length = 45)
    public String getGradingValueRepoOfficer() {
        return gradingValueRepoOfficer;
    }

    public void setGradingValueRepoOfficer(String gradingValueRepoOfficer) {
        this.gradingValueRepoOfficer = gradingValueRepoOfficer;
    }

    @Basic
    @Column(name = "Grading_Value_Count_Officer", nullable = true, length = 45)
    public String getGradingValueCountOfficer() {
        return gradingValueCountOfficer;
    }

    public void setGradingValueCountOfficer(String gradingValueCountOfficer) {
        this.gradingValueCountOfficer = gradingValueCountOfficer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradingEntity that = (GradingEntity) o;
        return gradingId == that.gradingId &&
                Objects.equals(gradingAttribute, that.gradingAttribute) &&
                Objects.equals(gradingValueRepoOfficer, that.gradingValueRepoOfficer) &&
                Objects.equals(gradingValueCountOfficer, that.gradingValueCountOfficer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradingId, gradingAttribute, gradingValueRepoOfficer, gradingValueCountOfficer);
    }
}
