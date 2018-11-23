/**
 * 
 */
package com.dsoft.qbwcwebapp.exception;

/**
 * @author dillon
 *
 */
public class PartialNullException extends NullPointerException {

	public PartialNullException() {
		super();
	}
	
	public PartialNullException(String message) {
		super(message);
	}
}
