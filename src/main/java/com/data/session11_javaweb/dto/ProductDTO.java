package com.data.session11_javaweb.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class ProductDTO {
    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ!")
    private String email;

    @Min(value = 1, message = "Đánh giá phải từ 1 sao")
    @Max(value = 5, message = "Đánh giá tối đa là 5 sao")
    private int evaluate;

    @Size(max = 200, message = "Bình luận không được vượt quá 200 ký tự")
    private String comment;
}
