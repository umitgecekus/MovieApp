package com.umit.controller;

import com.umit.entity.Genre;
import com.umit.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;


    @PostMapping("/save")
    public ResponseEntity<Genre> save(@RequestBody Genre genre){
        return ResponseEntity.ok(genreService.save(genre));
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<Optional<Genre>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(genreService.findById(id));
    }
    @GetMapping("/find-all")
    public ResponseEntity<List<Genre>> findAll() {
        return ResponseEntity.ok(genreService.findAll());
    }
}
