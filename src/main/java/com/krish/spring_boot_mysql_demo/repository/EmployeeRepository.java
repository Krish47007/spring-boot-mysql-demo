package com.krish.spring_boot_mysql_demo.repository;


import com.krish.spring_boot_mysql_demo.model.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDepartment,String> {

    @Query("select e.deptName from EmployeeDepartment e where e.empId = ?1")
    String getDepartmentForEmployee(String empId);

    @Query("select e from EmployeeDepartment e where e.empId in ?1")
    List<EmployeeDepartment> getEmployeeDepartmentRelation(Set<String> empIds);
}
