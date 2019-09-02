package com.CodeDust.OfficerEvaluation.model.repositories;

import com.CodeDust.OfficerEvaluation.model.GradingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradingEntityRepository extends JpaRepository<GradingEntity,Long> {
}
