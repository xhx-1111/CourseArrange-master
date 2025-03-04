package com.swpu.course.repository;

import com.swpu.course.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity,Long> {
    @Query(value = "SELECT * FROM classview", nativeQuery = true)
    List<ClassEntity> findAllClasses();
}
