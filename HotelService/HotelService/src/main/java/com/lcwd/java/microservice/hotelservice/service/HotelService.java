package com.lcwd.java.microservice.hotelservice.service;

import java.util.List;

import com.lcwd.java.microservice.hotelservice.model.Hotel;

public interface HotelService {
	
	Hotel save(Hotel hotel);
	
	Hotel getById(Long Id);
	
	List<Hotel> getAll();
	
	void delete(Long Id);
	

}
