package com.example.teacherapp.controler;

import com.example.teacherapp.model.Teacher;
import com.example.teacherapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/get")
    public List<Teacher> findAllTeachers(){
        return teacherService.findAllTeachers();
    }

    @PutMapping("/update")
    public Teacher updateTeacher(@RequestParam(name = "id") Integer id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/delete")
    public void deleteTeacher(@RequestParam(name = "id") Integer id) {
        teacherService.deleteTeacher(id);
    }
}
