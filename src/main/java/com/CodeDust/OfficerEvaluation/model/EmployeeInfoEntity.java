package com.CodeDust.OfficerEvaluation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class EmployeeInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String personalNr;
    private String postHeld;
    private String ministryDivision;
    private String serviceGroup;
    private String departmentOffice;
    private int periodServedDurationYears;
    private String reportingOfficer;
    private Integer empLanguageInfoId;
    private String employeeInfocol;

    public List<EmployeeTraninngEntity> getEmployeeTraninngEntities() {
        return employeeTraninngEntities;
    }

    @JsonManagedReference(value = "getSetCompanies")
    @JsonIgnore
    @OneToMany(mappedBy = "employeeInfoEntity",fetch = FetchType.EAGER)
    private List<EmployeeTraninngEntity> employeeTraninngEntities;


    public EmployeeInfoEntity(String name, String personalNr, String postHeld, String ministryDivision, String serviceGroup, String departmentOffice, int periodServedDurationYears, String reportingOfficer, Integer empLanguageInfoId, Integer empQualificationId, String employeeInfocol) {
        this.name = name;
        this.personalNr = personalNr;
        this.postHeld = postHeld;
        this.ministryDivision = ministryDivision;
        this.serviceGroup = serviceGroup;
        this.departmentOffice = departmentOffice;
        this.periodServedDurationYears = periodServedDurationYears;
        this.reportingOfficer = reportingOfficer;
        this.empLanguageInfoId = empLanguageInfoId;

        this.employeeInfocol = employeeInfocol;
    }

    public EmployeeInfoEntity() {
    }

    public EmployeeInfoEntity(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }

    public String getPostHeld() {
        return postHeld;
    }

    public void setPostHeld(String postHeld) {
        this.postHeld = postHeld;
    }

    public String getMinistryDivision() {
        return ministryDivision;
    }

    public void setMinistryDivision(String ministryDivision) {
        this.ministryDivision = ministryDivision;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public String getDepartmentOffice() {
        return departmentOffice;
    }

    public void setDepartmentOffice(String departmentOffice) {
        this.departmentOffice = departmentOffice;
    }

    public int getPeriodServedDurationYears() {
        return periodServedDurationYears;
    }

    public void setPeriodServedDurationYears(int periodServedDurationYears) {
        this.periodServedDurationYears = periodServedDurationYears;
    }

    public String getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(String reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    public Integer getEmpLanguageInfoId() {
        return empLanguageInfoId;
    }

    public void setEmpLanguageInfoId(Integer empLanguageInfoId) {
        this.empLanguageInfoId = empLanguageInfoId;
    }




    public String getEmployeeInfocol() {
        return employeeInfocol;
    }

    public void setEmployeeInfocol(String employeeInfocol) {
        this.employeeInfocol = employeeInfocol;
    }
}
