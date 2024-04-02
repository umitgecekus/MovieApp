package com.umit.repository;

import com.umit.entity.MovieComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MovieCommentRepository extends JpaRepository<MovieComment,Long> {

    List<MovieComment> findByMovieId(Long id);

    List<MovieComment> findByMovieIdAndDateBetween(Long id, LocalDate start, LocalDate end);

    @Query("SELECT m FROM MovieComment m WHERE LENGTH(m.content) >?1 ")
    List<MovieComment> findContentLengthGreaterThan(Integer length);

}
