/**
 * 
 */
package com.dsoft.qbwcwebapp.model;

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.UUID;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.dsoft.qbwcwebapp.exception.PartialNullException;

/**
 * @author dillon
 *
 */
public class Request {
	
	private String ticket;
	private String request;
	private String reqID;

	public Request(String ticket, String request) {
		this.request = request;
		this.ticket = ticket;
		this.reqID = UUID.randomUUID().toString();
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	public Request(String ticket, String request, String reqID) {
		this.request = request;
		this.ticket = ticket;
		this.reqID = reqID;
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	public Request(org.bson.Document document) {
		if (document.containsKey("request")) {
			request = document.getString("request");
		} else {
			request = null;
		}
		if (document.containsKey("ticket")) {
			ticket = document.getString("ticket");
		} else {
			ticket = null;
		}
		if (document.containsKey("reqID")) {
			reqID = document.getString("reqID");
		} else {
			reqID = UUID.randomUUID().toString();
		}
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	public String buildQBXML() {
		Document qbxml = null;
		final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		final String QB_HEAER = "<?qbxml version=\"13.0\"?>";
		boolean error = false;
		try {
			qbxml = new SAXBuilder().build(new StringReader(request));
		} catch (JDOMException | IOException e) {
			e.printStackTrace();
			error = true;
		}
		XMLOutputter outputter = new XMLOutputter(Format.getCompactFormat());
		if (!error) {
			return XML_HEADER + QB_HEAER + outputter.outputString(qbxml);
		} else {
			return "";
		}
	}

	/**
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(String request) {
		this.request = request;
	}
	
	/**
	 * @return the reqID
	 */
	public String getReqID() {
		return reqID;
	}

	public org.bson.Document toDocument() {
		return new org.bson.Document().append("ticket", ticket).append("request", request).append("reqID", reqID);
	}
}
