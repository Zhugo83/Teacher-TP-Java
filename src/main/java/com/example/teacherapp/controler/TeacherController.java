package com.example.teacherapp.controler;

import com.example.teacherapp.model.Teacher;
import com.example.teacherapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher) {
        return "OH my god";
    }

    //@GetMapping
    //public String getTeacherById(@RequestParam String id)

    //@PutMapping

    //@DeleteMapping
}
