/**
 * 
 */
package com.dsoft.qbwcwebapp.exception;

/**
 * @author dillon
 *
 */
public class PartialNullException extends NullPointerException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PartialNullException() {
		super();
	}
	
	public PartialNullException(String message) {
		super(message);
	}
}
