package com.spring.rest.webservice.restful_web_service.controller;



import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.rest.webservice.restful_web_service.controller.exception.UserNotFoundException;
import com.spring.rest.webservice.restful_web_service.model.User;
import com.spring.rest.webservice.restful_web_service.service.UserDaoService;

@RestController
public class UserResource {

	private UserDaoService service;

	public UserResource(UserDaoService service) {
		this.service = service;
	}

	// GET /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	// GET /users
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User foundUser=service.findOne(id);
		if(foundUser==null)
		{
			throw new UserNotFoundException("id : "+id);
		}
		return foundUser;
		
	}
	
	

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		//Whenever a user want to return the newly created resource there is specific HTTP header we need to make use 'location'
		User savedUser = service.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{id}")
						.buildAndExpand(savedUser.getId())
						.toUri();   
		
		return ResponseEntity.created(location).build(); // created method accepts a URI location 
	}

}