package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "service_group", schema = "employee_performance_evaluation", catalog = "")
public class ServiceGroupEntity {
    @Id
    @GeneratedValue
    private int serviceGroupId;
    private String name;

    @Id
    @Column(name = "Service_Group_Id", nullable = false)
    public int getServiceGroupId() {
        return serviceGroupId;
    }

    public void setServiceGroupId(int serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
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
        ServiceGroupEntity that = (ServiceGroupEntity) o;
        return serviceGroupId == that.serviceGroupId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceGroupId, name);
    }
}
