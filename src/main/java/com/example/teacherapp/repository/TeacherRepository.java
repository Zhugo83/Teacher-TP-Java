package com.example.teacherapp.repository;

import com.example.teacherapp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
