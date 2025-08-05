package com.lcwd.java.microservice.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -6773107520146923778L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
