/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.bson.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import com.dsoft.qbwcwebapp.db.DBAccountProxy;
import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.security.Crypto;

/**
 * @author dillon
 *
 */
@Path("/account")
public class Account {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postAccount(String json) {
		Document document = Document.parse(json);
		if (document != null && document.containsKey("username") && document.containsKey("password")) {
			Document newAccount = new Document();
			DBAccountProxy accountProxy = DBProxyFactory.getFactory().getAccounts();
			try {
				newAccount.put("username", (String) document.getString("username"));
				newAccount.put("passhash", Crypto.initHash(document.getString("password")));
			} catch (Exception e) {
				return Response.noContent().status(Status.BAD_REQUEST).build();
			}
			newAccount.put("token", UUID.randomUUID().toString());
			if (accountProxy.createDocument(newAccount)) {
				return Response.noContent().status(Status.CREATED).build();
			} else {
				return Response.noContent().status(Status.CONFLICT).build();
			}
		} else {
			return Response.noContent().status(Status.BAD_REQUEST).build();
		}
	}
	
	@Path("/gen-qwc/{username}")
	@GET
	public Response getQWC(@PathParam("username") String username) {
		String url, fileID = UUID.randomUUID().toString(), ownerID, configFile = "config.properties";
		Properties properties = new Properties();
		InputStream stream = getClass().getClassLoader().getResourceAsStream(configFile);
		try {
			properties.load(stream);
			url = properties.getProperty("dsoft_url");
			ownerID = properties.getProperty("dsoft_id");
			stream.close();
		} catch (IOException e) {
			return Response.noContent().status(Status.INTERNAL_SERVER_ERROR).build();
		}
		org.jdom2.Document qwc = new org.jdom2.Document();
		Element root = new Element("QBWCXML");
		root.addContent(new Element("AppName").addContent("DSoft QBWC REST Connector"));
		root.addContent(new Element("AppID"));
		root.addContent(new Element("AppURL").addContent(url));
		root.addContent(new Element("AppDescription").addContent("Web API for Quick Books Web Connector"));
		root.addContent(new Element("AppSupport").addContent("https://dickersonsoftware.com"));
		root.addContent(new Element("UserName").addContent(username));
		root.addContent(new Element("OwnerID").addContent(ownerID));
		root.addContent(new Element("FileID").addContent(fileID));
		root.addContent(new Element("QBType").addContent("QBFS"));
		root.addContent(new Element("Style").addContent("DocWrapped"));
		qwc.setRootElement(root);
		XMLOutputter outputter = new XMLOutputter();
		return Response.ok(outputter.outputString(qwc), MediaType.APPLICATION_XML).header("Content-Disposition", "attachment; filename=DsoftQWC.qwc").build();
	}
}
