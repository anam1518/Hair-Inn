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

import com.Dal.HairDao;
import com.model.*;
/**
 * @author Anam Javed
 *
 */
@Path("/HairService")
public class HairService {
	
	@GET
	@Path("/produce")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("/hair") String hairs) {

		final HairDao hair = new HairDao();

		return Response.status(200).entity(hair).build();

	}
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("userid") int userid, @PathParam("hairid") int hairid,@PathParam("haircolor") String haircolor, 
			@PathParam("hairlength") int hairlength) {
		Hair h = new Hair();
		h.setUserid(userid);
	h.setHairid(hairid);
	h.setHaircolor(haircolor);
	h.setHairlength(hairlength);

		String result = "Your Web-Service Says: " +userid + hairid +haircolor +hairlength ;
		

		return Response.status(200).entity(result).build();
        
	}

	
	
	
	
}
