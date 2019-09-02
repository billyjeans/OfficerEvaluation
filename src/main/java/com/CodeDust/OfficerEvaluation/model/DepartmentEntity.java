package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "department", schema = "employee_performance_evaluation", catalog = "")
public class DepartmentEntity {
    private int departmentId;
    private String name;

    @Id
    @GeneratedValue
    @Column(name = "Department_Id", nullable = false)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return departmentId == that.departmentId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, name);
    }
}
