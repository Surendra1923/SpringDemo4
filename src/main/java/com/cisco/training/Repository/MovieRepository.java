package com.cisco.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.training.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
	
	
	

}
