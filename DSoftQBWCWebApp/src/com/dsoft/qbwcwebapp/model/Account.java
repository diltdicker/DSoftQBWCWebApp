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
public class Account {
	
	private String ticket;
	private String username;
	private String passhash;

	public Account(String ticket, String username, String passHash) {
		this.ticket = ticket;
		this.username = username;
		this.passhash = passHash;
		if (this.ticket == null || this.username == null || this.passhash == null) {
			throw new PartialNullException();
		}
	}
	
	public Account(Document document) {
		this.ticket = document.getString("ticket");
		this.username = document.getString("username");
		this.passhash = document.getString("passhash");
		if (this.ticket == null || this.username == null || this.passhash == null) {
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the passhash
	 */
	public String getPasshash() {
		return passhash;
	}
	
	
}
