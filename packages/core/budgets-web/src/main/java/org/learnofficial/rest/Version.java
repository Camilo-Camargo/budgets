package org.learnofficial.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/rest/version")
public class Version {
  @GET
  @Path("/")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getVersion(){
    return Response.ok("v0.0.1").build();
  }
}
