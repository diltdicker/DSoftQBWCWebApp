/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBAccountProxy;
import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.db.DBRequestProxy;
import com.dsoft.qbwcwebapp.db.DBResponseProxy;
import com.dsoft.qbwcwebapp.model.Account;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

/**
 * @author dillon
 *
 */
@Path("/response/{username}/{reqid}")
public class Response {

	/**
	 * 
	 * @param username
	 * @param reqIDStr
	 * @return
	 */
	@GET
	public javax.ws.rs.core.Response getResponse(@PathParam("username") String username, @PathParam("reqid") String reqIDStr) {
		DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
		Document accountDocument = accountProxy.getDocument(new Document().append("username", username));
		accountProxy.closeDBConnection();
		if (accountDocument != null) {
			Account account = new Account(accountDocument);
			DBResponseProxy responseProxy = DBProxyFactory.getResponses();
			Document document = responseProxy.getDocument(new Document().append("ticket", account.getTicket()).append("reqID", reqIDStr));
			responseProxy.closeDBConnection();
			if (document != null) {
				com.dsoft.qbwcwebapp.model.Response response = new com.dsoft.qbwcwebapp.model.Response(document);
				return javax.ws.rs.core.Response.ok(response.toDocument().toJson(), MediaType.APPLICATION_JSON).status(Status.OK).build();
			} else {
				return javax.ws.rs.core.Response.noContent().status(Status.NOT_FOUND).build();
			}
		} else {
			return javax.ws.rs.core.Response.noContent().status(Status.UNAUTHORIZED).build();
		}
	}
	
	/**
	 * 
	 * @param username
	 * @param reqIDStr
	 * @return
	 */
	@DELETE
	public javax.ws.rs.core.Response deleteResponse(@PathParam("username") String username, @PathParam("reqid") String reqIDStr) {
		DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
		Document document = accountProxy.getDocument(new Document().append("username", username));
		accountProxy.closeDBConnection();
		if (document != null) {
			Account account = new Account(document);
			DBResponseProxy responseProxy = DBProxyFactory.getResponses();
			responseProxy.deleteDocument(new Document().append("ticket", account.getTicket()).append("reqID", reqIDStr));
			responseProxy.closeDBConnection();
			return javax.ws.rs.core.Response.noContent().status(Status.OK).build();
		} else {
			return javax.ws.rs.core.Response.noContent().status(Status.UNAUTHORIZED).build();
		}
		
	}
}
