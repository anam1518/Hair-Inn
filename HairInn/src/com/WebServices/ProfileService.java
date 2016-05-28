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

import com.Dal.FaceShapesDao;
import com.Dal.ProfileDao;
import com.model.ProfilePage;
import com.model.User;

/**
 * @author Anam Javed
 *
 */
public class ProfileService {
	
	
	@GET
	@Path("/ProfileService")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson( String profiles) {

		

		return Response.status(200).entity(profiles).build();

	}
	
	@GET
	@Path("/{Name}/{Address}/{age}/{weight}/{height}")
public Response PrintMessage(@PathParam("Name") String Name, @PathParam("Address") String Address,@PathParam("age") int age, @PathParam("weight") int weight,@PathParam("height") int height) {
	
		ProfilePage ps = new ProfilePage();
		ps.setName(Name);
		ps.setAddress(Address);
		ps.setAge(age);
		ps.setWeight(weight);
		ps.setHeight(height);
		final ProfileDao pg = new ProfileDao();
  	    pg.addProfilePage(ps);
		
  	  return Response.status(200).entity(pg).build();

	   
	
	
	}
}
