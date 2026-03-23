package com.example.teacherapp.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastName;
    @Column(unique = true)
    private String email;
    @OneToMany
    private List<ClassRoom> classRooms;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setClassRooms(List<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }
    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void teacher(String name, String lastName, String email){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

}
