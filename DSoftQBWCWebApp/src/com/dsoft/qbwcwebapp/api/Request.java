/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author dillon
 *
 */
@Path("/request")
public class Request {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRequest() {
		return Response.ok("{test : \"response\"}").status(Status.OK).build();
	}
}
