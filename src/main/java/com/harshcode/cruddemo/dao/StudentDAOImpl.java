package com.harshcode.cruddemo.dao;

import com.harshcode.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO{
    //DEFINE FIELD FOR THE ENTITY MANAGER
    private EntityManager entityManager;

    // INJECT ENTITY MANAGER USING CONSTRUCTOR INJECTION
@Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //IMPLEMENT SAVE METHOD

    @Override
    @Transactional
    public void save(Student theStudent) {
    entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }
}
