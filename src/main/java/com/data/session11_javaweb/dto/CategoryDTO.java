package com.data.session11_javaweb.dto;

import com.data.session11_javaweb.validator.CheckCategoryExist;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CategoryDTO {
    private int id;

    @NotBlank(message = "Tên danh mục không được để trống.")
    @Size(max = 50, message = "Tên danh mục không được quá 50 ký tự.")
    @CheckCategoryExist
    private String categoryName;
    private boolean status;
}
