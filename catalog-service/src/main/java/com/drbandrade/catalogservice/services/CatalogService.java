package com.drbandrade.catalogservice.services;

import com.drbandrade.catalogservice.dto.MovieDTO;
import com.drbandrade.catalogservice.interfaces.CatalogClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CatalogService {

    private final CatalogClient client;

    public Map<String, List<MovieDTO>> getMovies(String genre){

        return Map.of(genre,client.getMovies(genre));

    }

}
