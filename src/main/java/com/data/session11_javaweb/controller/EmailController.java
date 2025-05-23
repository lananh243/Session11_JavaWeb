package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EmailController {
    @GetMapping("email")
    public String emailForm(@ModelAttribute("emailDTO")EmailDTO emailDTO) {
        return "email_form";
    }

    @PostMapping("email-save")
    public String emailSave(@Valid @ModelAttribute("emailDTO")EmailDTO emailDTO,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "email_form";
        }
        return "result_register";
    }
}
