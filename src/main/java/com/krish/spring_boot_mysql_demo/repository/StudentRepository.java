package com.krish.spring_boot_mysql_demo.repository;

import com.krish.spring_boot_mysql_demo.model.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long>, JpaSpecificationExecutor<Student> {
}
