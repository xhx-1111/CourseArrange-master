package com.swpu.course.controller;

import com.swpu.course.entity.ClassEntity;
import com.swpu.course.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/classes")
    public List<ClassEntity> getAllClasses() {
        return classService.getAllClasses();
    }

}
