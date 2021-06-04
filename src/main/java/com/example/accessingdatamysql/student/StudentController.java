package com.example.accessingdatamysql.student;


import com.example.accessingdatamysql.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping
    public String addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);

    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


}
