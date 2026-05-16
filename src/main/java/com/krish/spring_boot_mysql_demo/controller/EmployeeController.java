package com.krish.spring_boot_mysql_demo.controller;

import com.krish.spring_boot_mysql_demo.model.EmployeeDepartment;
import com.krish.spring_boot_mysql_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/{empId}/dept")
    public String getDeptByEmpId(@PathVariable("empId") String empId)
    {
        return service.getDepartmentByEmpId(empId);
    }
    @GetMapping("/getAllEmpDpt")
    public List<EmployeeDepartment> getAllEmpDept(@RequestParam Set<String> empIds)
    {
        return service.getAllEmpDept(empIds);
    }
}
