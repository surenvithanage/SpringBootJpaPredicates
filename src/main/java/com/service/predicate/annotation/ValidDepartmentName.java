package com.service.predicate.annotation;

import com.service.predicate.validator.DepartmentNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DepartmentNameValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDepartmentName {
    String message() default "Invalid Department Name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
