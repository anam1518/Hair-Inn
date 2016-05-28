package com.WebServices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.Dal.LoginDao;
import com.Dal.UserDao;
import com.model.LoginPojo;
import com.model.User;

@Path("/LoginService")
public class LoginService {

	@GET
	@Path("/produce")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("username")String username, @PathParam("password")String pass) {
    
		final LoginPojo loginPojo =new LoginPojo();
		loginPojo.setUsername(username);
		loginPojo.setPassword(pass);
        final LoginDao logindao = new LoginDao();
        logindao.verify(loginPojo);
		
       
		String result = "Your Web-Service Says: " +username +pass;
		

		return Response.status(200).entity(result).build();
        
	}
	@GET 
	   @Path("/loginPojo")
	   @Produces(MediaType.APPLICATION_JSON)
	public LoginPojo verify(final LoginPojo pojo) {
		   return pojo;
		
	   } 

}
