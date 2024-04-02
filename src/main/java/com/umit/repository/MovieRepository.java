package com.umit.repository;

import com.umit.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findAllByRatingGreaterThan(Double rating);

    List<Movie> findByPremieredBefore(LocalDate premiered);

    List<Movie> findByRatingIn(List<Double> ratings);
}
