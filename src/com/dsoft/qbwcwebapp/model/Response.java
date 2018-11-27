/**
 * 
 */
package com.dsoft.qbwcwebapp.model;

import org.bson.Document;

import com.dsoft.qbwcwebapp.exception.PartialNullException;

/**
 * @author dillon
 *
 */
public class Response {

	private String ticket;
	private String response;
	private String reqID;
	
	public Response(String ticket, String response, String reqID) {
		this.ticket = ticket;
		this.response = response;
		this.reqID = reqID;
		if (this.ticket == null || this.response == null || this.reqID == null) {
			throw new PartialNullException();
		}
	}
	
	public Response(Document document) {
		if (document.containsKey("ticket") && document.containsKey("response") && document.containsKey("reqID")) {
			this.ticket = document.getString("ticket");
			this.response = document.getString("response");
			this.reqID = document.getString("reqID");
		} else {
			throw new PartialNullException();
		}
	}

	/**
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}
	
	/**
	 * @return the reqID
	 */
	public String getReqID() {
		return reqID;
	}

	public Document toDocument() {
		return new Document().append("ticket", ticket).append("response", response).append("reqID", reqID);
	}
}
