package com.data.session11_javaweb.dto;

import com.data.session11_javaweb.validator.CheckPhone;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PhoneDTO {

    @NotBlank(message = "Số điện thoại không được để trống")
    @CheckPhone
    private String phone;
}
