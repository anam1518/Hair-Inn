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

import com.Dal.FaceShapesDao;
import com.model.*;

/**
 * @author Anam Javed
 *
 */
@Path("/FaceShapesService")
public class FaceShapesService {

	@GET
	@Path("/faceshapes")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson( String shapes) {

		final FaceShapesDao faceshapes = new FaceShapesDao();

		return Response.status(200).entity(faceshapes).build();

	}
	
	@GET
	@Path("/{param}" )
	public Response printMessage(@PathParam("userid") int userid, @PathParam("Shapes") String shapes) {

	   FaceShapes fs =new FaceShapes();
	   fs.setUserid(userid);
	   fs.setShapes(shapes);
	   
		String result = "Your Web-Service Says: " +userid + shapes;
		

		return Response.status(200).entity(result).build();
        
	}
	
}
