package com.cisco.training.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@Column(name="movieid")
	private Long movieId;
	
	@Column(name="moviename")
	private String movieName;
	@Column(name="movierate")
	private int movieRate;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Long movieId, String movieName, int movieRate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRate = movieRate;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieRate() {
		return movieRate;
	}
	public void setMovieRate(int movieRate) {
		this.movieRate = movieRate;
	}
	
	

}
