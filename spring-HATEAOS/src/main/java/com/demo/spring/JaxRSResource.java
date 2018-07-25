package com.demo.spring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/api")
@Component
public class JaxRSResource {
	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet() {
		return "Hello Jersey";
	}
}
