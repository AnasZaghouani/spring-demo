package com.anas.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    //@Autowired
    private StudentService service ;
    //@Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student save(
            @RequestBody  Student student
    ){
        return service.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String em){
        return service.findByEmail(em);
    }
    @PutMapping
    public Student updateStudent(
           @RequestBody Student student
    ){
        return service.update(student);
    }
    @DeleteMapping("/delete/{email}")
    public void delete(@PathVariable  String email){
        service.delete(email);
    }
    @GetMapping("/get")
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
}
