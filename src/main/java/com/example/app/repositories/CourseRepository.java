package com.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    public Course findByCourseName(String courseName);
}
