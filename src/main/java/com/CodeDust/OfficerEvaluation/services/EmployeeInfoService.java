package com.CodeDust.OfficerEvaluation.services;

import com.CodeDust.OfficerEvaluation.model.EmployeeInfoEntity;
import com.CodeDust.OfficerEvaluation.model.repositories.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoService {

    @Autowired
    EmployeeInfoRepository employeeInfoRepository;


    public void save(EmployeeInfoEntity employeeInfoEntity) {

        employeeInfoRepository.save(employeeInfoEntity);
    }

    public EmployeeInfoEntity getEmployeebyId(long id) {
        return employeeInfoRepository.getOne(id);

    }

    public EmployeeInfoEntity findbyName(String name) {

        return employeeInfoRepository.findByName(name);
    }

    public List<EmployeeInfoEntity> getAll() {

        return employeeInfoRepository.findAll();
    }
    public List<EmployeeInfoEntity> findbyServedDuration(Long duration) {

        return employeeInfoRepository.findbyServedDuration(duration);
    }

}
