package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emp_qualifications", schema = "employee_performance_evaluation", catalog = "")
public class EmpQualificationsEntity {
    @Id
    @GeneratedValue
    private int empQualificationsId;



    private String qualificationName;
    private String institutionName;
    private String yearOfComp;

    @Id
    @Column(name = "Emp_Qualifications_Id", nullable = false)
    public int getEmpQualificationsId() {
        return empQualificationsId;
    }

    public void setEmpQualificationsId(int empQualificationsId) {
        this.empQualificationsId = empQualificationsId;
    }

    @Basic
    @Column(name = "Qualification_Name", nullable = true, length = 45)
    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    @Basic
    @Column(name = "Institution_Name", nullable = true, length = 45)
    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    @Basic
    @Column(name = "Year_Of_Comp", nullable = true, length = 45)
    public String getYearOfComp() {
        return yearOfComp;
    }

    public void setYearOfComp(String yearOfComp) {
        this.yearOfComp = yearOfComp;
    }
    private EmployeeInfoEntity employeeInfoEntity;
@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name = "")
    public EmployeeInfoEntity getEmployeeInfoEntity() {
        return employeeInfoEntity;
    }

    public void setEmployeeInfoEntity(EmployeeInfoEntity employeeInfoEntity) {
        this.employeeInfoEntity = employeeInfoEntity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpQualificationsEntity that = (EmpQualificationsEntity) o;
        return empQualificationsId == that.empQualificationsId &&
                Objects.equals(qualificationName, that.qualificationName) &&
                Objects.equals(institutionName, that.institutionName) &&
                Objects.equals(yearOfComp, that.yearOfComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empQualificationsId, qualificationName, institutionName, yearOfComp);
    }
}
