package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class MovieRepositoryImp implements  MovieRepository {
    @Override
    public Movie findByTitle(String title) {
        List<Movie> movies = Arrays.asList(
                new Movie(1, "Harry Potter", "harray@gmail.com", 2,
                        new Date(), new Date()),

                new Movie(2, "Ton Ngo Khong", "ton@gmail.com", 20,
                        new Date(), new Date())
        );

        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
