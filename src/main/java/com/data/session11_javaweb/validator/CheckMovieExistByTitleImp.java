package com.data.session11_javaweb.validator;

import com.data.session11_javaweb.model.Movie;
import com.data.session11_javaweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckMovieExistByTitleImp implements ConstraintValidator<CheckMovieExistByTitle, String> {
    @Autowired
    private MovieService movieService;
    @Override
    public boolean isValid(String title, ConstraintValidatorContext constraintValidatorContext) {
        Movie movie = movieService.findByTitle(title);
        if (movie == null){
            return true;
        }
        return false;
    }
}
