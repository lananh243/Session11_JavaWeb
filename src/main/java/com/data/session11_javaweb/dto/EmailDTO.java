package com.data.session11_javaweb.dto;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class EmailDTO {
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",
            message = "Email không hợp lệ!")
    private String email;
}
