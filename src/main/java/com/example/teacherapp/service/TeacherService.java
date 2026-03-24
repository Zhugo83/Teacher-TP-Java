package com.example.teacherapp.service;

import com.example.teacherapp.model.Teacher;
import com.example.teacherapp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> findAllTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher updateTeacher(Integer id, Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }
}
