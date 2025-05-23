package com.data.session11_javaweb.dto;

import com.data.session11_javaweb.validator.PasswordValidator;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PasswordDTO {
    @NotBlank(message = "Mật khẩu không được để trống")
    @PasswordValidator
    private String password;
}
