package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emp_language_info", schema = "employee_performance_evaluation", catalog = "")
public class EmpLanguageInfoEntity {
    @Id
    @GeneratedValue
    private int empLanguageInfoId;
    private String langName;
    private String langProficiency;

    @Id
    @Column(name = "Emp_Language_Info_Id", nullable = false)
    public int getEmpLanguageInfoId() {
        return empLanguageInfoId;
    }

    public void setEmpLanguageInfoId(int empLanguageInfoId) {
        this.empLanguageInfoId = empLanguageInfoId;
    }

    @Basic
    @Column(name = "Lang_Name", nullable = true, length = 45)
    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    @Basic
    @Column(name = "Lang_Proficiency", nullable = true, length = 45)
    public String getLangProficiency() {
        return langProficiency;
    }

    public void setLangProficiency(String langProficiency) {
        this.langProficiency = langProficiency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpLanguageInfoEntity that = (EmpLanguageInfoEntity) o;
        return empLanguageInfoId == that.empLanguageInfoId &&
                Objects.equals(langName, that.langName) &&
                Objects.equals(langProficiency, that.langProficiency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empLanguageInfoId, langName, langProficiency);
    }
}

