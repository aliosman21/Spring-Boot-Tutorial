package com.example.accessingdatamysql.subject;


import com.example.accessingdatamysql.dtos.SubjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String addNewSubject(@RequestBody SubjectDTO subject){
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
