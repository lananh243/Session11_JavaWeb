package com.data.session11_javaweb.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserB5DTO {
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 2, max = 30, message = "Tên phải có độ dài từ 2 đến 30 ký tự")
    private String name;

    @Email(message = "Email không hợp lệ!")
    @NotBlank(message = "Email không được để trống")
    private String email;

    private String role;

    @Size(max = 50, message = "Mô tả không được quá 50 ký tự")
    private String description;
}
