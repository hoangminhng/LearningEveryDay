package com.hoangminhng.lesson4.REST;

import com.hoangminhng.lesson4.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

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
         if (studentID > theStudents.size() || studentID < 0){
             throw new StudentNotFoundException("Student id not found - " + studentID);
         }
         return theStudents.get(studentID);
    }


}
