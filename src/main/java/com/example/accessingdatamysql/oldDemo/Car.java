//package com.example.accessingdatamysql;
//
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import javax.persistence.*;
//
//
//
//@Entity
//public class Car {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Integer id;
//
//    private String name;
//
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonBackReference
//    private User owner;
//
//    public User getOwner() {
//        return owner;
//    }
//
//    public void setOwner(User owner) {
//        this.owner = owner;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}
