package com.example.accessingdatamysql.subject;


import com.example.accessingdatamysql.student.Student;
import com.example.accessingdatamysql.teacher.Teacher;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;

import java.util.Set;
import java.util.UUID;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_enrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> enrolledStudents = new HashSet<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher;


    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudents(Student student){
        enrolledStudents.add(student);
    }

    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
    }


    public Teacher getTeacher() {
        return teacher;
    }
}

