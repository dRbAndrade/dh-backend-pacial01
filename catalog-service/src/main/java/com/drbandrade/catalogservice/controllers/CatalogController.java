package com.drbandrade.catalogservice.controllers;

import com.drbandrade.catalogservice.dto.MovieDTO;
import com.drbandrade.catalogservice.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService service;

    @GetMapping("/catalog/{genre}")
    public ResponseEntity<Map<String, List<MovieDTO>>> getMovies(@PathVariable String genre){
        return ResponseEntity.ok(service.getMovies(genre));
    }
}
