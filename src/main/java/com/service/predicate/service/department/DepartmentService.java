package com.service.predicate.service.department;

import com.service.predicate.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> fetch();

    Department save(Department department);

    Department update(Long id, Department department);

    Department delete(Long id);
}
