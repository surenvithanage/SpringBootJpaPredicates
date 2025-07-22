package com.service.predicate.service.professor;

import com.service.predicate.entity.Professor;

import java.util.List;

public interface ProfessorService {
    List<Professor> fetch();

    Professor save(Professor professor);

    Professor update(Long id, Professor professor);

    Professor delete(Long id);
}
