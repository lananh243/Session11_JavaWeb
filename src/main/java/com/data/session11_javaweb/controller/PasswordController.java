package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.PasswordDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PasswordController {
    @GetMapping("password")
    public String passwordForm(@ModelAttribute("passwordDTO")PasswordDTO passwordDTO) {
        return "password_form";
    }

    @PostMapping("password-save")
    public String passwordSave(@Valid @ModelAttribute("passwordDTO")PasswordDTO passwordDTO,
                               BindingResult result) {
        if (result.hasErrors()) {
            return "password_form";
        }
        return "result_register";
    }
}
