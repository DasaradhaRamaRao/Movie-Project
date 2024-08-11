package com.demo.movie.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.movie.entity.Movie;
import com.demo.movie.repository.MovieRepository;
 
@Service
//@Component
public class MovieService {
 
	@Autowired
	MovieRepository movieRepository;
	
	public void addMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public List<Movie> viewAll() {
		return movieRepository.findAll();
	}
	
	public Movie getMovieById(Integer movieId) {
		Movie movie = movieRepository.findById(movieId).orElse(null);
		// handle exception part
		return movie;
	}
	
	public List<Movie> viewMovieByGenre(String genre) 
	{
		return movieRepository.findMovieByGenre(genre);
	}
	
}