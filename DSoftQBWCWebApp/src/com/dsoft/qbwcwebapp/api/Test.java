/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bson.Document;

/**
 * @author dillon
 *
 */
@Path("/test")
public class Test {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTest() {
		return Response.ok(new Document().append("hello", "world").toJson()).build();
//		return Response.ok(new Document().append("hello", new Document().append("im_sorry", "dave")).toJson()).build();
	}
}
