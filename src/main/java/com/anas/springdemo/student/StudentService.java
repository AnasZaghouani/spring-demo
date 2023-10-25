package com.anas.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Stud1",
                        "Test",
                        LocalDate.now(),
                        "contact@student1.com",
                        34
                ),
                new Student(
                        "Stud3",
                        "Test2",
                        LocalDate.now(),
                        "contact@student2.com",
                        28
                )
        );
    }
}
