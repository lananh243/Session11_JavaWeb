package com.data.session11_javaweb.service;

import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;

import javax.validation.Valid;
import java.util.List;

public interface CategoryService {
    Category findByCategoryName(String categoryName);
    List<Category> findAll();
    void save(CategoryDTO category);
    boolean updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategory(int categoryId);
}
