package com.data.session11_javaweb.dto;

import com.data.session11_javaweb.validator.AdminGroup;
import com.data.session11_javaweb.validator.UserGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
public class RegistrationDTO {
    public interface AdminGroup {}
    public interface UserGroup {}

    @NotBlank(groups = {UserGroup.class, AdminGroup.class})
    private String name;

    @Email(groups = {UserGroup.class, AdminGroup.class})
    @NotBlank(groups = {UserGroup.class, AdminGroup.class})
    private String email;

    // Thông tin bổ sung cho admin
    @NotBlank(groups = AdminGroup.class)
    private String adminCode;

    // Vai trò người dùng
    private String role;
}
