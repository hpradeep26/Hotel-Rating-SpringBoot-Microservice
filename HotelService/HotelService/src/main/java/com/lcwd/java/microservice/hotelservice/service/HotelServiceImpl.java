package com.lcwd.java.microservice.hotelservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.java.microservice.hotelservice.exception.ResourceNotFoundException;
import com.lcwd.java.microservice.hotelservice.model.Hotel;
import com.lcwd.java.microservice.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	private final HotelRepository hotelRepository;
	
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel save(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getById(Long Id) {
		return hotelRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Hotel Not Found"+Id));
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public void delete(Long Id) {
		Hotel hotel = hotelRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Hotel Not Found"+Id));
		hotelRepository.delete(hotel);
		
	}

}
