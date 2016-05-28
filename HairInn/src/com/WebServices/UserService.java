/**
 * 
 */
package com.WebServices;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.Dal.UserDao;
import com.model.User;
/**
 * @author Anam Javed
 *
 */
@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();

	   @GET
	   @Path("/Produce")
	   @Produces(MediaType.APPLICATION_JSON)
 public List<User> getUser(){
	      return userDao.getAllUser();
	      
	   }
	   
	 
	   
	   @GET
		@Path("/{userid}/{firstName}/{lastName}/{Email}")
	   @Produces(MediaType.APPLICATION_JSON)
		public Response printMessage(@PathParam("userid") String userid, @PathParam("firstName") String firstName,@PathParam("lastName") String lastName, @PathParam("email") String Email) {

UserDao userDao = new UserDao();
		   User usr =new User();
		   usr.setFirstName(firstName);
		   usr.setLastName(lastName);
		   usr.setEmail(Email);
		   
		  
		   userDao.addUser(usr);
			String result = "Your Web-Service Says: " +userid + firstName +lastName +Email;
			

			return Response.status(200).entity(result).build();
	        
		}
	   
	   }  
	
