package com.lcwd.java.microservice.ratingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.java.microservice.ratingservice.exception.ResourceNotFoundException;
import com.lcwd.java.microservice.ratingservice.model.Rating;
import com.lcwd.java.microservice.ratingservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	private RatingRepository  ratingRepository;
	
	public RatingServiceImpl(RatingRepository ratingRepository) {
		super();
		this.ratingRepository = ratingRepository;
	}

	@Override
	public Rating save(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public Rating getById(Long Id) {
		return ratingRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Resource Not Found for "+Id));
	}

	@Override
	public List<Rating> getAll() {
		return ratingRepository.findAll();
	}

	@Override
	public void delete(Long Id) {
		Rating rating = ratingRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Resource Not Found for "+Id));
		ratingRepository.delete(rating);
	}

	@Override
	public List<Rating> findByUserId(Long userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> findByHotelId(Long hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}
	
	

}
