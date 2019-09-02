package com.CodeDust.OfficerEvaluation.model;

import com.CodeDust.OfficerEvaluation.model.EmployeeInfoEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "employee_evaluation_trainning", schema = "employee_performance_evaluation", catalog = "")
public class EmployeeTraninngEntity {
    public long getEmployee_evaluation_trainning_Id() {
        return employee_evaluation_trainning_Id;
    }

    public void setEmployee_evaluation_trainning_Id(long employee_evaluation_trainning_Id) {
        this.employee_evaluation_trainning_Id = employee_evaluation_trainning_Id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employee_evaluation_trainning_Id;
    private String Course_Attentedl;
    private String course_Start_Date;
    private String course_End_Date;
    private String course_Duration;
    private String course_Country;
    private String course_Institution;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_Info_Id")
    @JsonIgnore
    private EmployeeInfoEntity employeeInfoEntity;

    public EmployeeInfoEntity getEmployeeInfoEntity() {
        return employeeInfoEntity;
    }

    public void setEmployeeInfoEntity(EmployeeInfoEntity employeeInfoEntity) {
        this.employeeInfoEntity = employeeInfoEntity;
    }

    public String getCourse_Attented() {
        return Course_Attentedl;
    }

    public void setCourse_Attented(String course_Attented) {
        this.Course_Attentedl = course_Attented;
    }

    public String getCourse_Start_Date() {
        return course_Start_Date;
    }

    public void setCourse_Start_Date(String course_Start_Date) {
        this.course_Start_Date = course_Start_Date;
    }

    public String getCourse_End_Date() {
        return course_End_Date;
    }

    public void setCourse_End_Date(String course_End_Date) {
        this.course_End_Date = course_End_Date;
    }

    public String getCourse_Duration() {
        return course_Duration;
    }

    public void setCourse_Duration(String course_Duration) {
        this.course_Duration = course_Duration;
    }

    public String getCourse_Country() {
        return course_Country;
    }

    public void setCourse_Country(String course_Country) {
        this.course_Country = course_Country;
    }

    public String getCourse_Institution() {
        return course_Institution;
    }

    public void setCourse_Institution(String course_Institution) {
        this.course_Institution = course_Institution;
    }


}
