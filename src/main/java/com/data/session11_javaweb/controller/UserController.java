package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("user")
    public String userForm(@ModelAttribute("userDTO") UserDTO userDTO) {
        return "user_form";
    }

    @PostMapping("user-save")
    public String userSave(@Valid @ModelAttribute("userDTO") UserDTO userDTO,
                           BindingResult result) {
        if (result.hasErrors()) {
            return "user_form";
        }
        return "result_user";
    }
}
