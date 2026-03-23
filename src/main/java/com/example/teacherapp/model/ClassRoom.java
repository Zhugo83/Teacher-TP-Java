package com.example.teacherapp.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String classroomNumber;

    public void setId(Integer id) {
        this.id = id;
    }
    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }
    public Integer getId() {
        return id;
    }
    public String getClassroomNumber() {
        return classroomNumber;
    }
}
