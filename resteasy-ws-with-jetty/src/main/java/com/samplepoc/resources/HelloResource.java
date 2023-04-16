package com.samplepoc.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/*
 * This is a a webservice resource class which can be consumed  by uri http://localhost:8080/hello 
 */

@Tag(name = "Hello")
@Path("/hello")
public class HelloResource {


	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Operation(summary = "Get a hello message", description = "Returns a simple greeting message.")
	public String sayHello() {
	    return "Hello, world!";
	}

}
