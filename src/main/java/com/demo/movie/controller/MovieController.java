package com.demo.movie.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movie.beans.ApiResponse;
import com.demo.movie.entity.Movie;
import com.demo.movie.service.MovieService;
 
@RestController
public class MovieController {
 
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value="/movie", method = RequestMethod.POST)
	@PostMapping("/movie")
	public ResponseEntity<ApiResponse> addMovie (@RequestBody Movie movie) {
		movieService.addMovie(movie);
		ApiResponse response = new ApiResponse("successfully movie added",200);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}
	
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> viewAllMovies(){
		List<Movie> list = movieService.viewAll();
		return new ResponseEntity<List<Movie>>(list, HttpStatus.OK);
	}
	
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<Movie> getMovieById(@PathVariable("id") Integer movieId){
			Movie movie = movieService.getMovieById(movieId);
			return new ResponseEntity<Movie>(movie, HttpStatus.OK);
	}
	
	@GetMapping("/moviebygenre")
	public ResponseEntity<List<Movie>> viewAllMovies(@RequestParam("type") String genre){
		List<Movie> list = movieService.viewMovieByGenre(genre);
		return new ResponseEntity<List<Movie>>(list, HttpStatus.OK);
	}
	
/*	@GetMapping("/movie/{id1}/{id2}")
	public ResponseEntity<Movie> getMovieById(  @PathVariable("id1") Integer m1,  @PathVariable("id2") Integer m2)
	{ 
	}
	
	
	@GetMapping("/moviebygenre")
	public ResponseEntity<List<Movie>> viewAllMovies(@RequestParam("type1") String genre1, @RequestParam("type2") String genre2)
	{
	 
	}*/
}
 