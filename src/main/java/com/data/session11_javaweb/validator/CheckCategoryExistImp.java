package com.data.session11_javaweb.validator;

import com.data.session11_javaweb.model.Category;
import com.data.session11_javaweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCategoryExistImp implements ConstraintValidator<CheckCategoryExist, String> {
    @Autowired
    private CategoryService categoryService;


    @Override
    public boolean isValid(String categoryName, ConstraintValidatorContext constraintValidatorContext) {
        Category category = categoryService.findByCategoryName(categoryName);
        if (category == null) {
            return true;
        }
        return false;
    }
}
