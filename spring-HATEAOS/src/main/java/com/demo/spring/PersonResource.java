package com.demo.spring;

import org.springframework.hateoas.ResourceSupport;

class PersonResource extends ResourceSupport {

	String firstname;
	String lastname;

	public PersonResource() {
		// TODO Auto-generated constructor stub
	}

	public PersonResource(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}