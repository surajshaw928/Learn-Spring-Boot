package com.spring.rest.webservice.restful_web_service.model;


import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	
	//Different types of validations are defined in jakarta.validations.constraints package,
	//You can check it by yourself based on the validations you want on the fields
	
	@Size(min=2,message = "Name should be at least 2 characters")
	private String name;
	
	
	//Birthdate should be in the past
	@Past(message = "Birth should be in the past")
	private LocalDate birthDate;
	
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
}


