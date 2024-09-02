package com.wu.movie.MovieInteractionService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wu.movie.MovieInteractionService.entity.MovieCatalog;
import com.wu.movie.MovieInteractionService.entity.MovieInfo;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/getMovieFromMovieInfo")
	public MovieInfo getMovieFromMovieInfo() {

		MovieInfo m1 = restTemplate.getForObject("http://192.168.1.54:3333/movie/movieinfo/200", MovieInfo.class);
		return m1;
	
		
	}
	
//	@GetMapping("/getMovieIdFromMovieCatalog")
//	public MovieCatalog getMovieIdFromMovieCatalog() {
//
//		MovieCatalog c1= restTemplate.getForObject("http://localhost:8787/movie/items", MovieCatalog.class);
//		return c1;
//	}
}
