package com.service.predicate.service.student;

import com.service.predicate.dto.StudentDto;
import com.service.predicate.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetch();

    Student save(StudentDto student);

    Student update(Long id, StudentDto student);

    Student delete(Long id);
}
