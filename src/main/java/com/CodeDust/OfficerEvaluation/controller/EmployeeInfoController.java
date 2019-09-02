package com.CodeDust.OfficerEvaluation.controller;

import com.CodeDust.OfficerEvaluation.model.EmployeeInfoEntity;
import com.CodeDust.OfficerEvaluation.services.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
public class EmployeeInfoController {

    @Autowired
    EmployeeInfoService employeeInfoService;

    @GetMapping("get/{id}")
    public EmployeeInfoEntity getUser(@PathVariable Long id) {

        EmployeeInfoEntity employeeInfoEntity   =     employeeInfoService.getEmployeebyId(id);
        employeeInfoEntity.getEmployeeTraninngEntities().forEach(item->System.out.println(item.getCourse_Attented()));
        return employeeInfoEntity;
//        if (employeeInfoService.getAll().isEmpty()) {
//            employeeInfoService.save(new EmployeeInfoEntity("Test"));
//        }
//        System.out.println(employeeInfoService.getAll().get(0).getId());
    }
    @GetMapping ("/get/allemployees")
    public List<EmployeeInfoEntity> getAllEmployees() {

        return employeeInfoService.getAll();

    }
    @GetMapping("getUser/{name}")
    public EmployeeInfoEntity getEmployeeByName (@PathVariable String name){
        return employeeInfoService.findbyName(name);
    }
    @GetMapping("getUserby/{duration}")
    public List<EmployeeInfoEntity> getEmployeeByName (@PathVariable Long duration){
        return employeeInfoService.findbyServedDuration(duration);
    }
    @PostMapping("/saveEmployee")
    public void  createEmployee(@RequestBody EmployeeInfoEntity employeeInfoEntity) {
        employeeInfoService.save(employeeInfoEntity);


    }
}
