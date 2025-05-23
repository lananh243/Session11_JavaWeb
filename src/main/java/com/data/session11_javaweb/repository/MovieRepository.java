package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.model.Movie;
import org.springframework.stereotype.Repository;


public interface MovieRepository {
    Movie findByTitle(String title);
}
