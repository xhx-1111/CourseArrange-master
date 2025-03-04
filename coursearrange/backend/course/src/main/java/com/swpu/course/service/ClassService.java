package com.swpu.course.service;

import com.swpu.course.entity.ClassEntity;
import com.swpu.course.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<ClassEntity> getAllClasses() {
        return classRepository.findAllClasses();
    }
}
