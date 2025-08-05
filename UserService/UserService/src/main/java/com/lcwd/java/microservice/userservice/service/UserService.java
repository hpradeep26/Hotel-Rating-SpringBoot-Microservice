package com.lcwd.java.microservice.userservice.service;

import java.util.List;

import com.lcwd.java.microservice.userservice.model.User;

public interface UserService {
	
	User save(User user);
	
	User getById(Long userId);
	
	List<User> getAll();
	
	void deleteUser(Long userId);
}
