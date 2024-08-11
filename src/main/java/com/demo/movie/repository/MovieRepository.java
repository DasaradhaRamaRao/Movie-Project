package com.demo.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.movie.entity.Movie;

@Repository
//@Component
public interface MovieRepository extends JpaRepository <Movie, Integer>{
 
	List<Movie> findMovieByGenre(String genre);
}