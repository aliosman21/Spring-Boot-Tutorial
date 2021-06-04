package com.example.accessingdatamysql.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;


    public String addNewStudent(Student student) {

        try{
            studentRepository.save(student);
            return "Saved Successfully";
        }catch (Exception e){
            return "Database Error";

        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

