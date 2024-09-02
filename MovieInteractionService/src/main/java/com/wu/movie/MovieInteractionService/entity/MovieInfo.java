package com.wu.movie.MovieInteractionService.entity;

import jakarta.persistence.Entity;

@Entity
public class MovieInfo {
	int movieId;
	String movieName;
	
	@Override
	public String toString() {
		return "MovieInfo [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	public MovieInfo() {
	}
	
	public MovieInfo(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
}