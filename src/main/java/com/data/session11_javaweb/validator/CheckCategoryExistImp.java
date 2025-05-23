package com.data.session11_javaweb.validator;

import com.data.session11_javaweb.model.Category;
import com.data.session11_javaweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckCategoryExistImp implements ConstraintValidator<CheckCategoryExist, String> {

    @Autowired
    private CategoryService categoryService;

    @Override
    public boolean isValid(String categoryName, ConstraintValidatorContext context) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            return true;
        }

        Category category = categoryService.findByCategoryName(categoryName.trim());
        return category == null;
    }
}
