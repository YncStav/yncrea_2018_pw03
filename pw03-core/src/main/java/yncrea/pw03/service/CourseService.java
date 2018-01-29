package yncrea.pw03.service;

import yncrea.pw03.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> findByName(String name);
    public void saveCourse(Course course);
    public List<Course> findAll();
}
