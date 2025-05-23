package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.RegisterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("register")
    public String registerForm(@ModelAttribute("registerDTO") RegisterDTO registerDTO){
        return "register_form";
    }

    @PostMapping("register-save")
    public String registerSave(@Valid @ModelAttribute("registerDTO") RegisterDTO registerDTO,
                               BindingResult result){
        if(result.hasErrors()){
            return "register_form";
        }
        return "result_register";
    }
}
