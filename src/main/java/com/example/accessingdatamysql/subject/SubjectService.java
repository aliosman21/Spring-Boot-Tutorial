package com.example.accessingdatamysql.subject;

import com.example.accessingdatamysql.student.Student;
import com.example.accessingdatamysql.student.StudentRepository;
import com.example.accessingdatamysql.teacher.Teacher;
import com.example.accessingdatamysql.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    public String enrollStudentToSubject(UUID subject_id , UUID student_id){
        try {
            Subject subject = subjectRepository.findById(subject_id).get();
            Student student = studentRepository.findById(student_id).get();
            subject.enrollStudents(student);
            subjectRepository.save(subject);
            return "Student added";
        }catch (Exception e){
            return "Student not found";
        }
    }

    public String addNewSubject(Subject subject) {
        try{
            subjectRepository.save(subject);
            return "Saved Successfully";
        }catch (Exception e){
            return "Database Error";

        }
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public String assignTeacherToSubject(UUID subject_id , UUID teacher_id) {
        try {
            Subject subject = subjectRepository.findById(subject_id).get();
            Teacher teacher = teacherRepository.findById(teacher_id).get();
            subject.assignTeacher(teacher);
            subjectRepository.save(subject);
            return "Teacher added";
        }catch (Exception e){
            return "Teacher not found";
        }
    }



    public String uploadFile(MultipartFile file) {

        String fileLocation = new File("src\\main\\resources\\static").getAbsolutePath();

        try {
            Path copyLocation = Paths
                    .get( fileLocation+ File.separator + StringUtils.cleanPath(file.getOriginalFilename()));

            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
            return "Image Saved";
        } catch (Exception e) {
            e.printStackTrace();
            return "Something went wrong :/";
        }
    }
}
