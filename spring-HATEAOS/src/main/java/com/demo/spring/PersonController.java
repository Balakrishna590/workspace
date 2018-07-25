package com.demo.spring;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.lang.reflect.Method;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity get() throws Exception {
		PersonResource resource = new PersonResource();
		Link link = linkTo(PersonController.class).withSelfRel();
		resource.add(link);

		Link link2=linkTo(ControllerLinkBuilder.methodOn(PersonController.class).getPerson()).withRel("people/person");
		resource.add(link2);

		return ResponseEntity.ok(resource);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/person")
	public ResponseEntity getPerson() {

		PersonResource person = new PersonResource("Shantanu", "Banerjee");
		return ResponseEntity.ok(person);

	}
}
