/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * @author dillon
 *
 */
@Path("/account")
public class Account {

	/** 
	 * Former method for creating accounts. 
	 * Removed in favor of accounts being managed by administrators only.
	 * 
	 * @param json
	 * @return
	 */
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response postAccount(String json) {
//		Document document = Document.parse(json);
//		if (document != null && document.containsKey("username") && document.containsKey("password")) {
//			Document newAccount = new Document();
//			try {
//				newAccount.put("username", (String) document.getString("username"));
//				newAccount.put("passhash", Crypto.initHash(document.getString("password")));
//			} catch (Exception e) {
//				return Response.noContent().status(Status.BAD_REQUEST).build();
//			}
//			newAccount.put("ticket", UUID.randomUUID().toString());
//			DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
//			boolean created = accountProxy.createDocument(newAccount);
//			accountProxy.closeDBConnection();
//			if (created) {
//				return Response.noContent().status(Status.CREATED).build();
//			} else {
//				return Response.noContent().status(Status.CONFLICT).build();
//			}
//		} else {
//			return Response.noContent().status(Status.BAD_REQUEST).build();
//		}
//	}
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	@Path("/gen-qwc/{username}")
	@GET
	public Response getQWC(@PathParam("username") String username) {
		String url, fileID = UUID.randomUUID().toString(), ownerID, appName, appDescription, 
				supportUrl, configFile = "config.properties";
		Properties properties = new Properties();
		InputStream stream = getClass().getClassLoader().getResourceAsStream(configFile);
		try {
			properties.load(stream);
			url = properties.getProperty("app_url");
			ownerID = properties.getProperty("owner_id");
			appName = properties.getProperty("app_name");
			appDescription = properties.getProperty("app_description");
			supportUrl = properties.getProperty("support_url");
			stream.close();
		} catch (IOException e) {
			return Response.noContent().status(Status.INTERNAL_SERVER_ERROR).build();
		}
		org.jdom2.Document qwc = new org.jdom2.Document();
		Element root = new Element("QBWCXML");
		root.addContent(new Element("AppName").addContent(appName));
		root.addContent(new Element("AppID"));
		root.addContent(new Element("AppURL").addContent(url));
		root.addContent(new Element("AppDescription").addContent(appDescription));
		root.addContent(new Element("AppSupport").addContent(supportUrl));
		root.addContent(new Element("UserName").addContent(username));
		root.addContent(new Element("OwnerID").addContent("{" + ownerID + "}"));
		root.addContent(new Element("FileID").addContent("{" + fileID + "}"));
		root.addContent(new Element("QBType").addContent("QBFS"));
		root.addContent(new Element("Style").addContent("DocWrapped"));
		qwc.setRootElement(root);
		XMLOutputter outputter = new XMLOutputter();
		return Response.ok(outputter.outputString(qwc), MediaType.APPLICATION_XML).header("Content-Disposition", 
				"attachment; filename=" + appName + ".qwc").build();
	}
}
