//package com.example.accessingdatamysql;
//
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Integer id;
//
//    private String name;
//
//    private String email;
//
//    @OneToMany(mappedBy="owner",cascade=CascadeType.ALL)
//    @JsonManagedReference
//    private List< Car > cars;
//
//    @PrePersist
//    @PreUpdate
//    public void updateAddressAssociation() {
//        for (Car c : this.cars) {
//            c.setOwner(this);
//        }
//    }
//
//
//
//
//
//    public List<Car> getCars() {
//        return cars;
//    }
//
//    public void setCars(List<Car> cars) {
//        this.cars = cars;
//    }
//
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
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
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}
