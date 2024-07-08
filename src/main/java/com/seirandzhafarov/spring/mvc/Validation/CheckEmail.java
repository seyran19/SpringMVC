package com.seirandzhafarov.spring.mvc.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface CheckEmail {

    public String value() default "xyz.com";
    public String message() default "Invalid email address";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
