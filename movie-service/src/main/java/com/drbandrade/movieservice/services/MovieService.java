package com.drbandrade.movieservice.services;

import com.drbandrade.movieservice.entities.Movie;
import com.drbandrade.movieservice.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<Movie> getMovies(String genre){
        return repository.findAllByGenre(genre);
    }

}
