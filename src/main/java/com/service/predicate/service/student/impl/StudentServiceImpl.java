package com.service.predicate.service.student.impl;

import com.service.predicate.dto.StudentDto;
import com.service.predicate.entity.Student;
import com.service.predicate.service.student.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Student> fetch() {
        return List.of();
    }

    @Override
    public Student save(StudentDto studentDto) {
        return new Student();
    }

    @Override
    public Student update(Long id, StudentDto student) {
        return null;
    }

    @Override
    public Student delete(Long id) {
        return null;
    }
}
