package com.example.accessingdatamysql.teacher;

import com.example.accessingdatamysql.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public String addNewTeacher(@RequestBody Teacher teacher){
        return teacherService.addNewTeacher(teacher);
    }


    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
}
