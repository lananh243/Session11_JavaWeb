package com.data.session11_javaweb.service;

import com.data.session11_javaweb.model.Movie;
import com.data.session11_javaweb.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    private MovieRepository movieRepo;
    @Override
    public Movie findByTitle(String title) {
        return movieRepo.findByTitle(title);
    }
}
