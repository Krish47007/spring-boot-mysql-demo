package com.krish.spring_boot_mysql_demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_dept")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartment {

    @Id
    @Column(name = "employee_id")
    private String empId;
    @Column(name = "department_name")
    private String deptName;
}
