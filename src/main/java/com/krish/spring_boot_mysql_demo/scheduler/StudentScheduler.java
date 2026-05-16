package com.krish.spring_boot_mysql_demo.scheduler;

import com.krish.spring_boot_mysql_demo.model.Student;
import com.krish.spring_boot_mysql_demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@EnableScheduling
@Service
@AllArgsConstructor
public class StudentScheduler {

    @Autowired
    private final StudentService studentService;

   // @Scheduled(fixedRate = 3 * 60 * 1000)
    public void run()
    {
        Student updatedStudent = studentService.updateStudent(1L);
        System.out.println(updatedStudent.toString());
    }
}
