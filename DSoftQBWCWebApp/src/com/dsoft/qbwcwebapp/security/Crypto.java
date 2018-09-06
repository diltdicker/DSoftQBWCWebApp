/**
 * 
 */
package com.dsoft.qbwcwebapp.security;

import org.mindrot.jbcrypt.BCrypt;

/**
 * @author dillon
 *s
 */
public interface Crypto {

	public static boolean authenticate(String hash, String password) {
		return BCrypt.checkpw(password, hash);
	}
	
	public static String initHash(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(16));
	}
}
