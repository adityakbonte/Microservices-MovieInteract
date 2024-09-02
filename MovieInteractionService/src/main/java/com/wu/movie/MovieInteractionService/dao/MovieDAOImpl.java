package com.wu.movie.MovieInteractionService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class MovieDAOImpl implements MovieDAO{
	@Autowired
	private RestTemplate restTemplate;
	
	
}
