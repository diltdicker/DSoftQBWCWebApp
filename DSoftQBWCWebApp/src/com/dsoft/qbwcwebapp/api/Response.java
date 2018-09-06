/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

/**
 * @author dillon
 *
 */
@Path("/response/{req_id}")
public class Response {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response getResponse(@PathParam("req_id") String reqIDStr) {
		return null;
	}
	
	@DELETE
	public javax.ws.rs.core.Response deleteResponse(@PathParam("req_id") String reqIDStr) {
		return javax.ws.rs.core.Response.noContent().status(Status.OK).build();
	}
}
