/**
 * 
 */
package com.dsoft.qbwcwebapp.api;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * This class initializes Jersey so that the web.xml is never touched.
 * 
 * @author dillon
 *
 */
@ApplicationPath("qbxml")
public class WebAPI extends ResourceConfig{
	
	public WebAPI() {
//		System.out.println("Resource config");
		packages("com.dickersonsoftware.api");
	}

}
