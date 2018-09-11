/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.model.Account;

/**
 * @author dillon
 *
 */
@Path("/request")
public class Request {
	
	/**
	 * Request end-point for qbxml requests
	 * 
	 * @param json - the qbxml request in json format
	 * format:
	 * 	{
	 * 		request: {qbxml tree here}
	 * 	}
	 * @param username - the username of the client.
	 * @return - if successful returns the request as it is stored in the database, else returns a 4xx error.
	 */
	@POST
	@Path("/{username}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postRequest(String json, @PathParam("username") String username) {
		Document document = Document.parse(json);
		if (document.containsKey("request") && document.containsKey("username")) {
			Document requestDocument;
			try {
				requestDocument = (Document) document.get("request");
			} catch (Exception e) {
				return Response.noContent().status(Status.BAD_REQUEST).build();
			}
			Document accountDocument = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
			if (accountDocument != null) {
				Account account = new Account(accountDocument);
				com.dsoft.qbwcwebapp.model.Request request = new com.dsoft.qbwcwebapp.model.Request(account.getTicket(), requestDocument);
				request.setReqID(DBProxyFactory.getFactory().getRequests().getNewestID(new Document().append("ticket", account.getTicket())) + 1);
				if (DBProxyFactory.getFactory().getRequests().createDocument(request.toDocument())) {
					return Response.ok(request.toDocument().toJson(), MediaType.APPLICATION_JSON).status(Status.CREATED).build();
				} else {
					return Response.noContent().status(Status.CONFLICT).build();
				}
			} else {
				return Response.noContent().status(Status.UNAUTHORIZED).build();
			}
		} else {
			return Response.noContent().status(Status.BAD_REQUEST).build();
		}
	}
}
