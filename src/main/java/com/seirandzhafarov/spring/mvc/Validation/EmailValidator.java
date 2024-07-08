package com.seirandzhafarov.spring.mvc.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String EndOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        EndOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(EndOfEmail);
    }
}
