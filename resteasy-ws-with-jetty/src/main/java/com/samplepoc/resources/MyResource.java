package com.samplepoc.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayGoodbye() {
        return "This is a Test adding new App !";
    }


}


