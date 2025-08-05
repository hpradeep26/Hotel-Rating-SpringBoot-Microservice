package com.lcwd.java.microservice.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.java.microservice.ratingservice.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

	List<Rating> findByUserId(Long userId);

	List<Rating> findByHotelId(Long hotelId);
}
