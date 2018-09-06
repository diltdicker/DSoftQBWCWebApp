/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

/**
 * @author dillon
 *
 */
public class ResponseProxy implements ProxyInterface {

	private MongoCollection<Document> collection;
	
	public ResponseProxy(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	@Override
	public Document getDocument(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDocument(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateDocument(Document document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createDocument(Document document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Document getLastDocument() {
		// TODO Auto-generated method stub
		return null;
	}
}
