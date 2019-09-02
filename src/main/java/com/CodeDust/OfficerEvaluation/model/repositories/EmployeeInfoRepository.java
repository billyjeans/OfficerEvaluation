package com.CodeDust.OfficerEvaluation.model.repositories;

import com.CodeDust.OfficerEvaluation.model.EmployeeInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfoEntity,Long> {

public EmployeeInfoEntity findByName(String name);



@Query("SELECT e FROM EmployeeInfoEntity e WHERE e.periodServedDurationYears> 5")
public List<EmployeeInfoEntity> findbyServedDuration (@Param("duration") Long duration);
}
