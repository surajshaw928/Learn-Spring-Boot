package com.spring.rest.webservice.restful_web_service.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.webservice.restful_web_service.model.Name;
import com.spring.rest.webservice.restful_web_service.model.PersonV1;
import com.spring.rest.webservice.restful_web_service.model.PersonV2;


//We can version our API in different ways
@RestController
public class VersioningPersonController {
//	TWITTER 	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Parameter versioning AMAZON

	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionOfPersonRequestParameter() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

//	Header versioning - MICROSOFT
	
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonRequestHeader() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonRequestHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

	//MEDIA type versioning ,GIUTHUB
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	
	/*
	 * FACTORS TO CONSIDER API VERSIONING
	 * 
	 * URI POLLUTION
	 * MISUSE OF HTTP HEADERS
	 * CACHING (For header type versioning and media type versioning the reuaest cannot be simpley be cached base on URL due to these changes
	 * REQUEST ON BROWSER
	 * API DOCUMENTATION 
	 */

}
