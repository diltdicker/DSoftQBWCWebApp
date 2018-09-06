/**
 * 
 */
package com.dsoft.qbwcwebapp.model;

import org.bson.Document;

/**
 * @author dillon
 *
 */
public class Request {
	
	private String ticket;
	private Document request;
	private long reqID;

	public Request(String ticket, Document request, long reqID) {
		
	}
	
	public Request(Document document) {
		
	}
	
	public String buildXML() {
		return null;
	}
}
