/**
 * 
 */
package com.dsoft.qbwcwebapp.model;

/**
 * @author dillon
 *
 */
public class MongoWrapper {
	
	private static MongoWrapper mongoWrapper = null;

	private MongoWrapper() {}
	
	public static MongoWrapper getWrapper() {
		if (mongoWrapper == null) {
			mongoWrapper = new MongoWrapper();
		}
		return mongoWrapper;
	}
}
