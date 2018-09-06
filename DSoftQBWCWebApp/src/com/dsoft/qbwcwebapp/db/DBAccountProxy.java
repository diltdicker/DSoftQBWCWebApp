/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

/**
 * @author dillon
 *
 */
public class DBAccountProxy implements DBProxyInterface {

	private MongoCollection<Document> collection;
	
	public DBAccountProxy(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	@Override
	public Document getDocument(Document document) {
		FindIterable<Document> iterable = collection.find(document);
		return iterable.first();
	}

	@Override
	public void deleteDocument(Document document) {
		collection.findOneAndDelete(document);
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

	@Override
	public long getCollectionSize() {
		return collection.countDocuments();
	}

	@Override
	public void updateDocument(Document document, Document updatedDocument) {
		collection.findOneAndReplace(document, updatedDocument);
	}
}
