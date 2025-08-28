package com.access.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.access.exception.SpecializationNotFoundException;


@RestControllerAdvice
public class SpecializationNotFoundExceptionHandler {

	@ExceptionHandler(SpecializationNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(SpecializationNotFoundException e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
