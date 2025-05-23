package com.data.session11_javaweb.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class RegisterDTO {
    @NotBlank(message = "Tên người dùng không được để trống")
    private String name;

    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "Email không hợp lệ!")
    private String email;

    @Size(min = 8, message = "Mật khẩu phải có độ dài 8 ký tự")
    private String password;
}
