package com.data.session11_javaweb.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckPhoneImp implements ConstraintValidator<CheckPhone, String> {
    private static final String PHONE_REGEX = "^0\\d{9}$";

    @Override
    public void initialize(CheckPhone constraintAnnotation) {}

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone == null) {
            return false;
        }
        return phone.matches(PHONE_REGEX);
    }
}
