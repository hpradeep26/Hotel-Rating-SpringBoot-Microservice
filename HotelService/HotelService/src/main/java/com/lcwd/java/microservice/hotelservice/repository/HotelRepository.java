package com.lcwd.java.microservice.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.java.microservice.hotelservice.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
