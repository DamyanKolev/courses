package com.example.app.models;

import jakarta.persistence.Entity;

@Entity
public class Course {
    public Long Id;
    public String CourseName;
    public String CourseDescription;
}
