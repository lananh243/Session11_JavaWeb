package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;
import com.data.session11_javaweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("category")
    public String categoryForm(@ModelAttribute("categoryDTO") CategoryDTO categoryDTO) {
        return "category_form";
    }

    @PostMapping("add-category")
    public String addCategory(@ModelAttribute("categoryDTO") CategoryDTO categoryDTO,
                              @ModelAttribute("category") Category category,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "category_form";
        }
        categoryService.findByCategoryName(category.getCategoryName());
        return "category_success";
    }
}
