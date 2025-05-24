package com.example.firstproject;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student getById(int id);
    List<Student> getAll();
    void update(Student student);
    void delete(int id);

}
