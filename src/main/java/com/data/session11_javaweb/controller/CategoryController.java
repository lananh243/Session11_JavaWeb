package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;
import com.data.session11_javaweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("category")
    public String categoryForm(@ModelAttribute("categoryDTO") CategoryDTO categoryDTO) {
        return "category_form";
    }

    @PostMapping("add-category")
    public String addCategory(@Valid @ModelAttribute("categoryDTO") CategoryDTO categoryDTO,
                              BindingResult result, Model  model) {
        if (result.hasErrors() && categoryService.findByCategoryName(categoryDTO.getCategoryName()) != null) {
            return "category_form";
        } else {
            categoryService.save(categoryDTO);

            List<Category> categoryList = categoryService.findAll();
            model.addAttribute("categoryList", categoryList);
            return "category_success";
        }
    }

    @GetMapping("add-category")
    public String addCategoryForm(Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "category_success";
    }



    @PostMapping("delete-category/{id}")
    public String deleteCategory(@PathVariable("id") int id, Model model) {
        if (categoryService.deleteCategory(id)) {
            List<Category> categoryList = categoryService.findAll();
            model.addAttribute("categoryList", categoryList);
            return "category_success";
        } else {
            // Xử lý lỗi nếu cần
            return "error"; // Hoặc trang nào đó bạn muốn
        }
    }

}
