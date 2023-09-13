package com.srinath.my_sboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinath.my_sboot.model.Employee;
import com.srinath.my_sboot.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("hello")
    String hello() {
        return "Hello Srinath";
    }

    @PostMapping("save")
    Employee addEmployee(@RequestBody Employee emp) {
        return employeeService.save(emp);
    }

    @GetMapping("all")
    List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }
}
