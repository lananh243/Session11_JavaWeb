package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.RegistrationDTO;
import com.data.session11_javaweb.validator.AdminGroup;
import com.data.session11_javaweb.validator.UserGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private final Validator validator;

    public RegistrationController(Validator validator) {
        this.validator = validator;
    }

    @GetMapping("registerB5")
    public String registerB5(@ModelAttribute("registrationDTO")RegistrationDTO registrationDTO) {
        return "regis_form";
    }

    @PostMapping("save-register")
    public String saveRegister(@Validated @ModelAttribute("registrationDTO")RegistrationDTO registrationDTO,
                               BindingResult result, Model model) {
        if ("admin".equals(registrationDTO.getRole())) {
            // Kiểm tra thông tin admin
            validator.validate(registrationDTO, result);
        } else {
            // Kiểm tra thông tin người dùng thường
            validator.validate(registrationDTO, result);
        }
        if (result.hasErrors()) {
            return "regis_form";
        }
        return null;
    }
}
