package com.data.session11_javaweb.service;

import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;
import com.data.session11_javaweb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepo;


    @Override
    public Category findByCategoryName(String categoryName) {
        return categoryRepo.findByCategoryName(categoryName);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void save(CategoryDTO category) {
        Category category1 = new Category();
        category.setCategoryName(category1.getCategoryName());
        category.setStatus(category1.isStatus());
       categoryRepo.save(category);
    }

    @Override
    public boolean updateCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setId(categoryDTO.getId());
        category.setCategoryName(categoryDTO.getCategoryName());
        category.setStatus(categoryDTO.isStatus());
        return categoryRepo.update(category);
    }

    @Override
    public boolean deleteCategory(int categoryId) {
        return categoryRepo.delete(categoryId);
    }
}
