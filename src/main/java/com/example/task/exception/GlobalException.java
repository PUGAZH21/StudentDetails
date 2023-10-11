package com.example.task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> AgeHandling(AgeNotFoundException z) {
		return new ResponseEntity<>(z.getMessage(), HttpStatus.NOT_FOUND);
	}
}
