package com.CodeDust.OfficerEvaluation.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "promotion", schema = "employee_performance_evaluation", catalog = "")
public class PromotionEntity {
    @Id
    @GeneratedValue
    private int promotionId;
    private String promotionAttribute;
    private String promotionValueRepoOfficer;
    private String promotionValueCountOfficer;

    @Id
    @Column(name = "Promotion_Id", nullable = false)
    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    @Basic
    @Column(name = "Promotion_Attribute", nullable = true, length = 45)
    public String getPromotionAttribute() {
        return promotionAttribute;
    }

    public void setPromotionAttribute(String promotionAttribute) {
        this.promotionAttribute = promotionAttribute;
    }

    @Basic
    @Column(name = "Promotion_Value_Repo_Officer", nullable = true, length = 45)
    public String getPromotionValueRepoOfficer() {
        return promotionValueRepoOfficer;
    }

    public void setPromotionValueRepoOfficer(String promotionValueRepoOfficer) {
        this.promotionValueRepoOfficer = promotionValueRepoOfficer;
    }

    @Basic
    @Column(name = "Promotion_Value_Count_Officer", nullable = true, length = 45)
    public String getPromotionValueCountOfficer() {
        return promotionValueCountOfficer;
    }

    public void setPromotionValueCountOfficer(String promotionValueCountOfficer) {
        this.promotionValueCountOfficer = promotionValueCountOfficer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEntity that = (PromotionEntity) o;
        return promotionId == that.promotionId &&
                Objects.equals(promotionAttribute, that.promotionAttribute) &&
                Objects.equals(promotionValueRepoOfficer, that.promotionValueRepoOfficer) &&
                Objects.equals(promotionValueCountOfficer, that.promotionValueCountOfficer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, promotionAttribute, promotionValueRepoOfficer, promotionValueCountOfficer);
    }
}
