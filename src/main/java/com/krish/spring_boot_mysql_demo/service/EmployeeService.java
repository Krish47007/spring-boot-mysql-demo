package com.krish.spring_boot_mysql_demo.service;

import com.krish.spring_boot_mysql_demo.model.EmployeeDepartment;
import com.krish.spring_boot_mysql_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public String getDepartmentByEmpId(String empId)
    {
        return repository.getDepartmentForEmployee(empId);
    }

    public List<EmployeeDepartment> getAllEmpDept(Set<String> empIds)
    {
        String eIds = String.join(",", empIds);
        return repository.getEmployeeDepartmentRelation(empIds);
    }
}
