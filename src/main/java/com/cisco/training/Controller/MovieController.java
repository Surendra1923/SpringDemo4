package com.cisco.training.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.training.Entity.Movie;
import com.cisco.training.Repository.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@GetMapping("/getallmovies")
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();// select * from Movie;
		
	}
	
	@PostMapping("insertmovie")
	public Movie insertMovie(@RequestBody Movie mv) {
		return movieRepo.save(mv);
	}
	
	@GetMapping("/getmoviebyid/{movid}")
	public Movie getMovie(@PathVariable("movid")Long movieId) {
		return movieRepo.findById(movieId).get();
	}
	
	@DeleteMapping("/delebyid/{moveid}")
	public void DeleteById(@PathVariable("moveid")Long movieId) {
		movieRepo.deleteById(movieId);
	}
	
	@PutMapping("/updabyid/{movieid}")
	public Movie UpdateById(@PathVariable("movieid")Long movieId,@RequestBody Movie mv) {
		Movie exstingMovie =getMovie(movieId);
		exstingMovie.setMovieId(mv.getMovieId());
		exstingMovie.setMovieName(mv.getMovieName());
		exstingMovie.setMovieRate(mv.getMovieRate());
		return movieRepo.save(mv);
		
	}

}
