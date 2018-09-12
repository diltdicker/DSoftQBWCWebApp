/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBProxyFactory.DBConnection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

/**
 * @author dillon
 *
 */
public class DBAccountProxy implements DBProxyInterface {

	private MongoCollection<Document> collection;
	private DBConnection connection;
	
	public DBAccountProxy(MongoCollection<Document> collection, DBConnection connection) {
		this.collection = collection;
		this.connection = connection;
	}

	@Override
	public Document getDocument(Document document) {
		if (document.containsKey("username")) {
			FindIterable<Document> iterable = collection.find(new Document().append("username", document.get("username")));
			document = iterable.first();
			return document;
		} else {
			return null;
		}
	}

	@Override
	public void deleteDocument(Document document) {
		collection.findOneAndDelete(document);
	}

	@Override
	public boolean createDocument(Document document) {
		if (getDocument(new Document().append("username", document.getString("username"))) == null) {
			collection.insertOne(document);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Document getLastDocument(Document document) {
		return collection.find(document).first();
	}

	@Override
	public long getCollectionSize(Document document) {
		return collection.countDocuments(document);
	}

	@Override
	public void updateDocument(Document document, Document updatedDocument) {
		collection.findOneAndReplace(document, updatedDocument);
	}

	@Override
	public void closeDBConnection() {
		connection.getClient().close();
	}
}
