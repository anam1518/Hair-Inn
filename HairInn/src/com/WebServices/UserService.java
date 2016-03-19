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
	   @Path("/user")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<User> getUser(){
	      return userDao.getAllUser();
	   }
	   
	 
	   
	   @GET
		@Path("/user}")
		public Response printMessage(@PathParam("userid") int userid, @PathParam("firstName") String firstName,@PathParam("lastName") String lastName, 
				@PathParam("age") String age, @PathParam("weight") int weight, @PathParam("height") int height) {

		   User usr =new User();
		   usr.setUserid(userid);
		   usr.setFirstName(firstName);
		   usr.setLastName(lastName);
		   usr.setAge(age);
		   usr.setWeight(weight);
		   usr.setHeight(height);
			String result = "Your Web-Service Says: " +userid + firstName +lastName +age +weight +height;
			

			return Response.status(200).entity(result).build();
	        
		}
	   }  
	
