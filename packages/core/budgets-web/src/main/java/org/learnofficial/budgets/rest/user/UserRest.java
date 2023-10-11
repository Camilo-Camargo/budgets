package org.learnofficial.budgets.rest.user;

import org.learnofficial.budgets.models.User;
import org.learnofficial.budgets.repositories.UserRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;


@Path("/rest/user")
public class UserRest{
  
  @Inject
  UserRepository userRepository;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Response getUserData(){
    User user = new User("camilo camargo");
    userRepository.create(user);
    return Response.ok(user.getId()).build();
  }

}
