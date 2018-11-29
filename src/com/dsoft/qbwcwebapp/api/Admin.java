/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBAccountProxy;
import com.dsoft.qbwcwebapp.db.DBProxyFactory;
import com.dsoft.qbwcwebapp.security.Crypto;

/**
 * @author dillon
 *
 */
@Path("/admin")
public class Admin {

	/**
	 * 
	 * @param jsonStr
	 * @return
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAccount(String jsonStr) {
		Document json = Document.parse(jsonStr);
		if (json != null && json.containsKey("admin-username") && json.containsKey("admin-password") && 
				json.containsKey("client-username") && json.containsKey("client-password")) {
			String adminUsernameProperty, adminPasswordProperty, adminUsername, adminPassword, 
			clientUsername, clientPassword, configFile = "config.properties";
			Properties properties = new Properties();
			Document account = new Document();
			InputStream stream = getClass().getClassLoader().getResourceAsStream(configFile);
			try {
				properties.load(stream);
				adminUsernameProperty = properties.getProperty("admin_username");
				adminPasswordProperty = properties.getProperty("admin_password");
				stream.close();
			} catch (IOException e) {
				return Response.noContent().status(Status.INTERNAL_SERVER_ERROR).build();
			}
			try {
				adminUsername = json.getString("admin-username");
				adminPassword = json.getString("admin-password");
				clientUsername = json.getString("client-username");
				clientPassword = json.getString("client-password");
			} catch (ClassCastException e) {
				return Response.noContent().status(Status.BAD_REQUEST).build();
			}
			if (adminUsernameProperty.equals(adminUsername) && adminPasswordProperty.equals(adminPassword)){
				account.put("ticket", UUID.randomUUID().toString());
				account.put("username", clientUsername);
				account.put("passhash", Crypto.initHash(clientPassword));
				DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
				boolean created = accountProxy.createDocument(account);
				accountProxy.closeDBConnection();
				if (created) {
					return Response.noContent().status(Status.CREATED).build();
				} else {
					return Response.noContent().status(Status.CONFLICT).build();
				}
			} else {
				return Response.noContent().status(Status.UNAUTHORIZED).build();
			}
		}else {
			return Response.noContent().status(Status.BAD_REQUEST).build();
		}
	}
	
	/**
	 * 
	 * @param jsonStr
	 * @return
	 */
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteAccount(String jsonStr) {
		Document json = Document.parse(jsonStr);
		if (json != null && json.containsKey("admin-username") && json.containsKey("admin-password") && 
				json.containsKey("client-username")) {
			String adminUsernameProperty, adminPasswordProperty, adminUsername, adminPassword, 
			clientUsername, configFile = "config.properties";
			Properties properties = new Properties();
			Document account = new Document();
			InputStream stream = getClass().getClassLoader().getResourceAsStream(configFile);
			try {
				properties.load(stream);
				adminUsernameProperty = properties.getProperty("admin_username");
				adminPasswordProperty = properties.getProperty("admin_password");
				stream.close();
			} catch (IOException e) {
				return Response.noContent().status(Status.INTERNAL_SERVER_ERROR).build();
			}
			try {
				adminUsername = json.getString("admin-username");
				adminPassword = json.getString("admin-password");
				clientUsername = json.getString("client-username");
			} catch (ClassCastException e) {
				return Response.noContent().status(Status.BAD_REQUEST).build();
			}
			if (adminUsernameProperty.equals(adminUsername) && adminPasswordProperty.equals(adminPassword)){
				account.put("username", clientUsername);
				DBAccountProxy accountProxy = DBProxyFactory.getAccounts();
				accountProxy.deleteDocument(account);
				accountProxy.closeDBConnection();
				return Response.noContent().status(Status.ACCEPTED).build();
			} else {
				return Response.noContent().status(Status.UNAUTHORIZED).build();
			}
		}else {
			return Response.noContent().status(Status.BAD_REQUEST).build();
		}
	}
}
