package com.WebServices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.Dal.UserDao;
import com.model.User;

@Path("/LoginService")
public class LoginService {

	@GET
	@Path("/user{email,password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("/user") String user) {

		final UserDao usr = new UserDao();

		return Response.status(200).entity(usr).build();

	}
	
	@GET
	@Path("/user{email,password}")
	public Response printMessage(@PathParam("email") String email,@PathParam("password") String pass ) {
		User usr =new User();
		usr.setEmail(email);
		usr.setPassword(pass);

		String result = "Your Web-Service Says: " + email +pass;
		

		return Response.status(200).entity(result).build();
        
	}
	@GET 
	   @Path("/user")
	   @Produces(MediaType.APPLICATION_JSON)
	   public void VerifyLogin(User user) {
		   return;
		
	   } 

}
