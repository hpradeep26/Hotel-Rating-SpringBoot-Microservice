package com.lcwd.java.microservice.userservice.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lcwd.java.microservice.userservice.model.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingClient {

	//String url = "http://RATINGSERVICE/api/ratings/users/"+user.getUserId();
	@GetMapping("/api/ratings/users/{userId}")
    List<Rating> getUserRatings(@PathVariable("userId") Long userId);
	
	@PostMapping("/api/ratings")
	public ResponseEntity<Rating> save(Rating rating);
}
