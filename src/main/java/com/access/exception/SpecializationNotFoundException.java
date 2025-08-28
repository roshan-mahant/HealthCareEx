package com.access.exception;


public class SpecializationNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public SpecializationNotFoundException() {
		
	}
	
    public SpecializationNotFoundException(String message) {
		super(message);
	}
}
