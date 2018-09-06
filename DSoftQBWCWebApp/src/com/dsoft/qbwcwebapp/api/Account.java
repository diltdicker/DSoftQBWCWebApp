/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import java.util.UUID;

import javax.ws.rs.Consumes;
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
@Path("/account")
public class Account {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postAccount(String json) {
		Document document = Document.parse(json);
		if (document != null && document.containsKey("username") && document.containsKey("password")) {
			Document newAccount = new Document();
			DBAccountProxy accountProxy = DBProxyFactory.getFactory().getAccounts();
			newAccount.put("username", (String) document.get("username"));
			newAccount.put("passhash", Crypto.initHash(document.getString("password")));
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
}
