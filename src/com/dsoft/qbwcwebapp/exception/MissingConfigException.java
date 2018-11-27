/**
 * 
 */
package com.dsoft.qbwcwebapp.exception;

/**
 * @author dillon
 *
 */
public class MissingConfigException extends NullPointerException {

	public MissingConfigException() {
		super();
	}
	
	public MissingConfigException(String message) {
		super(message);
	}
}
