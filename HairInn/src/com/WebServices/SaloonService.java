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

import com.Dal.SaloonDao;
import com.model.*;
/**
 * @author Anam Javed
 *
 */
@Path("SaloonService")
public class SaloonService {
	@GET
	@Path("/Saloon")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("Saloon") String saloons) {

		final SaloonDao saloon = new SaloonDao();

		return Response.status(200).entity(saloon).build();

	}
	
	@GET
	@Path("/Saloon")
	public Response printMessage(@PathParam("saloonid") int saloonid, @PathParam("Name") String name,
			@PathParam("eamil")String email, @PathParam("ContactNo") String contactNo, @PathParam("Address")String address){
		
	
		Saloon s = new Saloon();
		
	s.setSaloonid(saloonid);
	s.setName(name);
	s.setEmail(email);
	s.setContactNo(contactNo);
	s.setAddress(address);
	
	
   String result = "Your Web-Service Says: " +saloonid +name +email +contactNo +address;
		

		return Response.status(200).entity(result).build();
        
	}
	
}
