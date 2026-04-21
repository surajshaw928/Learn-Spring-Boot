package com.spring.rest.webservice.restful_web_service.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

/*
 * In order to not put the entire Exception trace, the devtools dependency need to be disabled , In the jar that is automatically disabled
 * 
 * 
 * Spring decides the response format based on the Accept header.
 * In case of browser it accepts a text/html response [CONTENT NEGOTIATION] 
 * In case of postman it accepts a JSON response
 */
