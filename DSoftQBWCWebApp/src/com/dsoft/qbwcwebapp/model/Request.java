/**
 * 
 */
package com.dsoft.qbwcwebapp.model;

import java.util.Iterator;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
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
	private org.bson.Document request;
	private long reqID;

	public Request(String ticket, org.bson.Document request) {
		this.request = request;
		this.ticket = ticket;
		this.reqID = -1;
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	public Request(String ticket, org.bson.Document request, long reqID) {
		this.request = request;
		this.ticket = ticket;
		this.reqID = reqID;
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	public Request(org.bson.Document document) {
		if (document.containsKey("request")) {
			request = (org.bson.Document) document.get("request");
		} else {
			request = new org.bson.Document();
		}
		if (document.containsKey("ticket")) {
			ticket = document.getString("ticket");
		} else {
			ticket = null;
		}
		if (document.containsKey("reqID")) {
			reqID = document.getLong("reqID");
		} else {
			reqID = -1;
		}
		if (request == null || ticket == null) {
			throw new PartialNullException();
		}
	}
	
	@SuppressWarnings("unchecked")
	public String buildXML() {
		JSONObject object = null;
		try {
			object = new JSONObject(request.toJson());
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
		boolean error = false;
		final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		final String QB_HEAER = "<?qbxml version=\"13.0\"?>";
		Document xmlDocument = new Document();
		Iterator<String> iterator = object.keys();
		String rootKey = iterator.next();
		while (iterator.hasNext()) {
			iterator.next();
		}
		Element root = new Element(rootKey);
		try {
			object = object.getJSONObject(rootKey);
		} catch (JSONException e) {
			error = true;
		}
		recursiveJSONToXML(object, root);
		xmlDocument.setRootElement(root);
		XMLOutputter outputter = new XMLOutputter();
		outputter.setFormat(Format.getCompactFormat().setOmitDeclaration(true));
		if (!error) {
			return XML_HEADER + QB_HEAER + outputter.outputString(xmlDocument);
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void recursiveJSONToXML(JSONObject object, Element parent) {
		Iterator<String> iterator = object.keys();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Element element = new Element(key);
			if (key.equalsIgnoreCase("QBXMLMsgsRq")) {
				element.setAttribute(new Attribute("onError", "stopOnError"));
			}
			parent.addContent(element);
			Object obj;
			try {
				obj = object.get(key);
			} catch (JSONException e) {
				obj = "Type Error";
			}
			if (obj instanceof JSONObject) {
				recursiveJSONToXML((JSONObject)obj, element);
			} else if (obj instanceof JSONArray) {
				element.addContent("JSON Array not implemented");
			} else {
				element.addContent(obj.toString());
			}
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
	public org.bson.Document getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(org.bson.Document request) {
		this.request = request;
	}

	/**
	 * @return the reqID
	 */
	public long getReqID() {
		return reqID;
	}

	/**
	 * @param reqID the reqID to set
	 */
	public void setReqID(long reqID) {
		this.reqID = reqID;
	}
	
	public org.bson.Document toDocument() {
		org.bson.Document requestDocument = new org.bson.Document().append("ticket", ticket).append("request", request);
		if (reqID > -1) {
			requestDocument.put("reqID", reqID);
		}
		return requestDocument;
	}
}
