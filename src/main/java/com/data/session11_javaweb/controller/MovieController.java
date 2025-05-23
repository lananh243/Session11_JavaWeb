package com.data.session11_javaweb.controller;

import com.data.session11_javaweb.dto.MovieDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MovieController {
    @GetMapping("movie")
    public String movieForm(@ModelAttribute("movieDTO") MovieDTO movieDTO) {
        return "movie_form";
    }


    @PostMapping("movie-save")
    public String movieSave(@Valid @ModelAttribute("movieDTO") MovieDTO movieDTO,
                            BindingResult result) {
        System.out.println(movieDTO);
        System.out.println(result.getFieldErrors());
        System.out.println(result.hasErrors());
        if (result.hasErrors()) {
            return "movie_form";
        }
        return "movie_success";
    }
}
