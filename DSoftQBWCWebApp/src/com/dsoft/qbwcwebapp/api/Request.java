/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import java.io.IOException;
import java.io.StringReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.bson.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import com.dsoft.qbwcwebapp.db.DBAccountProxy;
import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.db.DBRequestProxy;
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
	 * @param xml - the xml request to send to Quickbooks
	 * @param username - the username of the client.
	 * @return - if successful returns the request as it is stored in the database, else returns a 4xx error.
	 */
	@POST
	@Path("/{username}")
	@Consumes(MediaType.APPLICATION_XML)
	public Response postRequest(String xml, @PathParam("username") String username) {
		DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
		Document accountDocument = accountProxy.getDocument(new Document().append("username", username));
		accountProxy.closeDBConnection();
		if (accountDocument != null) {
			boolean error = false;
			org.jdom2.Document xmlDoc = null;
			try {
				xmlDoc = new SAXBuilder().build(new StringReader(xml));
			} catch (JDOMException | IOException e) {
				error = true;
			}
			if (!error) {
				Account account = new Account(accountDocument);
				XMLOutputter outputter = new XMLOutputter(Format.getCompactFormat());
				com.dsoft.qbwcwebapp.model.Request request = new com.dsoft.qbwcwebapp.model.Request(account.getTicket(), outputter.outputString(xmlDoc));
				DBRequestProxy requestProxy = DBProxyFactory.getRequests();
				boolean created = requestProxy.createDocument(request.toDocument());
				requestProxy.closeDBConnection();
				if (created) {
					return Response.ok(request.toDocument().toJson(), MediaType.APPLICATION_JSON).status(Status.CREATED).build();
				} else {
					return Response.noContent().status(Status.CONFLICT).build();
				}
			} else {
				return Response.noContent().status(Status.BAD_REQUEST).build();
			}
		} else {
			return Response.noContent().status(Status.UNAUTHORIZED).build();
		}
	}
}
