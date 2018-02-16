package org.gkh.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class JsonResource {	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/jsonjaxb")
	public Response toJettisonJaxb() {
		XmlPojo pojo = new XmlPojo(1, "");
		return Response.ok().entity(pojo).build();		
	}
}
