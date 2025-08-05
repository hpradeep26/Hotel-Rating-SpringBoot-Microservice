package com.lcwd.java.microservice.ratingservice.service;

import java.util.List;

import com.lcwd.java.microservice.ratingservice.model.Rating;


public interface RatingService {

	Rating save(Rating hotel);

	Rating getById(Long Id);

	List<Rating> getAll();

	void delete(Long Id);
	
	List<Rating> findByUserId(Long userId);
	
	List<Rating> findByHotelId(Long hotelId);
}
