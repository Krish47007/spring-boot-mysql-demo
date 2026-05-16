package com.krish.spring_boot_mysql_demo.repository;

import com.krish.spring_boot_mysql_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long>, JpaSpecificationExecutor<Student> {

    /*@Query("select s from Student s")
    List<Student> getAllStudents();*/
}
