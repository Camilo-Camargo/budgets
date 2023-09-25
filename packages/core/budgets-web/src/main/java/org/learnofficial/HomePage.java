package org.learnofficial;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class HomePage{
  @GET
  @Produces(MediaType.TEXT_HTML)
  public Response getHTMLContent(){
    return Response.ok("<h1>Welcome to budgets</h1>").build();
  }
}
