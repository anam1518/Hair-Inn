/**
 * 
 */
package com.WebServices;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.Dal.HairstylesDao;
import com.model.*;
/**
 * @author Anam Javed
 *
 */
@Path("HairStylesService")
public class HairStylesService {
	@GET
	@Path("/HairStyles")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("/HairStyles") String styles) {

		final HairstylesDao hairstyles = new HairstylesDao();

		return Response.status(200).entity(hairstyles).build();

	}
	@GET
	@Path("/HairStyles}")
	public Response printMessage(@PathParam("hairid") int hairid, @PathParam("haircut") String haircut){
		
	
		Hairstyles hs = new Hairstyles();
		
	hs.setHairid(hairid);
	hs.setHaircut(haircut);
	

		String result = "Your Web-Service Says: " +hairid +haircut;
		

		return Response.status(200).entity(result).build();
        
	}
}
