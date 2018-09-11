/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

/**
 * @author dillon
 *
 */
@Path("/response/{username}/{reqid}")
public class Response {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response getResponse(@PathParam("username") String username, @PathParam("reqid") String reqIDStr) {
		
		return javax.ws.rs.core.Response.ok(username + " a test").status(Status.OK).build();
	}
	
	@DELETE
	public javax.ws.rs.core.Response deleteResponse(@PathParam("username") String username, @PathParam("reqid") String reqIDStr) {
		return javax.ws.rs.core.Response.noContent().status(Status.OK).build();
	}
}
