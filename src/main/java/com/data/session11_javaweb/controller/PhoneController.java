package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.PhoneDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("phone")
    public String phoneForm(@ModelAttribute("phoneDTO") PhoneDTO phoneDTO) {
        return "phone_form";
    }

    @PostMapping("phone-save")
    public String phoneSave(@Valid @ModelAttribute("phoneDTO") PhoneDTO phoneDTO,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "phone_form";
        }
        return "result_register";
    }
}
