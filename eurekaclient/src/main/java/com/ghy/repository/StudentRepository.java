package com.ghy.repository;

import com.ghy.entity.Student;

import java.util.Collection;

public interface StudentRepository {
     Collection<Student> findAll();
     Student findById(long id);
     void saveOrUpdate(Student student);
     void deleteById(long id);
}
