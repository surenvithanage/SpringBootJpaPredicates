package com.service.predicate.controller.student;

import com.service.predicate.dto.StudentDto;
import com.service.predicate.service.student.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/students")
@Tag(name = "Student", description = "Operations related to students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/validation")
    @Operation(summary = "Create a student", description = "Creates a new student")
    public ResponseEntity<?> create(@Valid @RequestBody StudentDto student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(error -> error.getField() + ": " + error.getDefaultMessage())
                    .toList();

            return ResponseEntity.badRequest().body(errors);
        }

        return ResponseEntity.ok(studentService.save(student));
    }


}
