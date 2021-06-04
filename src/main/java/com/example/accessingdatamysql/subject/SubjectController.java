package com.example.accessingdatamysql.subject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;



    @PostMapping
    public String addNewSubject(@RequestBody Subject subject){
        return subjectService.addNewSubject(subject);

    }

    @PutMapping("/{subjectId}/student/{studentId}")
    public String enrollStudentToSubject(@PathVariable UUID subjectId,
                                         @PathVariable UUID studentId){
        return  subjectService.enrollStudentToSubject(subjectId,studentId);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    public String assignTeacherToSubject(@PathVariable UUID subjectId,
                                         @PathVariable UUID teacherId){
        return  subjectService.assignTeacherToSubject(subjectId,teacherId);
    }

    @GetMapping
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }




    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        return subjectService.uploadFile(file);

    }


}
