package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ministry_division", schema = "employee_performance_evaluation", catalog = "")
public class MinistryDivisionEntity {
    @Id
    @GeneratedValue
    private int ministryDivisionId;
    private String name;
    private String provincialOrFederal;

    @Id
    @Column(name = "Ministry_Division_Id", nullable = false)
    public int getMinistryDivisionId() {
        return ministryDivisionId;
    }

    public void setMinistryDivisionId(int ministryDivisionId) {
        this.ministryDivisionId = ministryDivisionId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ProvincialOrFederal", nullable = true, length = 45)
    public String getProvincialOrFederal() {
        return provincialOrFederal;
    }

    public void setProvincialOrFederal(String provincialOrFederal) {
        this.provincialOrFederal = provincialOrFederal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinistryDivisionEntity that = (MinistryDivisionEntity) o;
        return ministryDivisionId == that.ministryDivisionId &&
                Objects.equals(name, that.name) &&
                Objects.equals(provincialOrFederal, that.provincialOrFederal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ministryDivisionId, name, provincialOrFederal);
    }
}
