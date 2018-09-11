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

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.model.Account;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

/**
 * @author dillon
 *
 */
@Path("/response/{username}/{reqid}")
public class Response {

	@GET
	public javax.ws.rs.core.Response getResponse(@PathParam("username") String username, @PathParam("reqid") Long reqIDStr) {
		Document document = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
		if (document != null) {
			Account account = new Account(document);
			document = DBProxyFactory.getFactory().getResponses().getDocument(new Document().append("ticket", account.getTicket()).append("reqID", reqIDStr));
			if (document != null) {
				com.dsoft.qbwcwebapp.model.Response response = new com.dsoft.qbwcwebapp.model.Response(document);
				XMLSerializer serializer = new XMLSerializer();
				String json = ((JSON) serializer.read(response.getResponse())).toString();
				return javax.ws.rs.core.Response.ok(json, MediaType.APPLICATION_JSON).status(Status.OK).build();
			} else {
				return javax.ws.rs.core.Response.noContent().status(Status.NOT_FOUND).build();
			}
		} else {
			return javax.ws.rs.core.Response.noContent().status(Status.NOT_FOUND).build();
		}
	}
	
	@DELETE
	public javax.ws.rs.core.Response deleteResponse(@PathParam("username") String username, @PathParam("reqid") Long reqIDStr) {
		Document document = DBProxyFactory.getFactory().getAccounts().getDocument(new Document().append("username", username));
		if (document != null) {
			Account account = new Account(document);
			DBProxyFactory.getFactory().getResponses().deleteDocument(new Document().append("ticket", account.getTicket()).append("reqID", reqIDStr));
		}
		return javax.ws.rs.core.Response.noContent().status(Status.OK).build();
	}
}
