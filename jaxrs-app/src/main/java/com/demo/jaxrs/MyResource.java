package com.demo.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/app")
public class MyResource {

	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet() {
		return "Hello Jersey";
	}

	@Path("/emp/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOne(@PathParam("id") int id) {
		Emp e = new Emp(id, "Shantanu", "Hyderabad", 98000);
		return Response.ok(e).build();
	}

}
