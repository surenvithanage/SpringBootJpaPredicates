package com.service.predicate.service.course;

import com.service.predicate.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> fetch();

    Course save(Course course);

    Course update(Long id, Course course);

    Course delete(Long id);
}
