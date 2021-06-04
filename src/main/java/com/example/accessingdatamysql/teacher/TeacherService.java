package com.example.accessingdatamysql.teacher;

import com.example.accessingdatamysql.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public String addNewTeacher(Teacher teacher) {
        try{
            teacherRepository.save(teacher);
            return "Saved Successfully";
        }catch (Exception e){
            return "Database Error";

        }
    }
}
