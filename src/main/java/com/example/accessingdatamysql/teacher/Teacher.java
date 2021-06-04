package com.example.accessingdatamysql.teacher;


import com.example.accessingdatamysql.subject.Subject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private Set<Subject> subjects = new HashSet<>();

    public Set<Subject> getSubjects() {
        return subjects;
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
}
