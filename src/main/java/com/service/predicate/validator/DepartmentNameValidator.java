package com.service.predicate.validator;

import com.service.predicate.annotation.ValidDepartmentName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DepartmentNameValidator implements ConstraintValidator<ValidDepartmentName, String> {
    @Override
    public boolean isValid(String input, ConstraintValidatorContext context) {
        if (input == null || input.trim().isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Department name must be empty")
                    .addConstraintViolation();
            return false;
        }

        if (!input.matches("^[a-zA-Z0-9 ]+$")) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Department name must be alphanumeric")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }
}
