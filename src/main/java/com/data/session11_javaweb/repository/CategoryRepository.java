package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;

import javax.validation.Valid;
import java.util.List;

public interface CategoryRepository {
    Category findByCategoryName(String categoryName);

    List<Category> findAll();

    void save(@Valid CategoryDTO category);

    boolean update(Category category);
    boolean delete(int categoryId);
}
