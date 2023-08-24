package com.hoangminhng.lesson4.REST;

import com.hoangminhng.lesson4.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
     private List<Student> theStudents;
     @PostConstruct
     public void loadData(){
         theStudents = new ArrayList<>();
         theStudents.add(new Student("HoangMinh", "NguyenVan"));
         theStudents.add(new Student("HaLinh", "LeNgoc"));
         theStudents.add(new Student("Sibu", "Subi"));
     }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable int studentID){
         return theStudents.get(studentID);
    }
}
