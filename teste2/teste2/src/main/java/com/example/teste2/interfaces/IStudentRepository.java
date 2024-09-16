package com.example.teste2.interfaces;

import com.example.teste2.entities.Student;

import java.util.List;

public interface IStudentRepository {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(int id,Student student);
    void delete(int id);
}
