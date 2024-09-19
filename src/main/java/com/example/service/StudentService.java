package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService {
    public Student create(Student student);
    public List<Student> getAllStudents();
    public Student getById(Integer id);
    public void delete(Integer id);

}
