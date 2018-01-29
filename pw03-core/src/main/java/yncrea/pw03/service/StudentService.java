package yncrea.pw03.service;

import yncrea.pw03.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findByLastname(String lastname);
    public void saveStudent (Student student);
    public List<Student> findAll();
}
