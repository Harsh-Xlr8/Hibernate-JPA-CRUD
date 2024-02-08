package com.harshcode.cruddemo.dao;

import com.harshcode.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);
}
