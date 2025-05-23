package com.data.session11_javaweb.service;

import com.data.session11_javaweb.model.Movie;

public interface MovieService {
    Movie findByTitle(String title);
}
