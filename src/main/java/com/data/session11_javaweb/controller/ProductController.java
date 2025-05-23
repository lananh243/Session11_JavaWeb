package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProductController {
    @GetMapping("product")
    public String productForm(@ModelAttribute("productDTO") ProductDTO productDTO) {
        return "product_form";
    }

    @PostMapping("product-save")
    public String productSave(@Valid @ModelAttribute("productDTO") ProductDTO productDTO,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "product_form";
        }
        return "result_product";
    }
}
