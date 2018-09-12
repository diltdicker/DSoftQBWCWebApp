/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import java.util.ArrayList;

import org.bson.Document;

import com.dsoft.qbwcwebapp.db.DBProxyFactory.DBConnection;
import com.dsoft.qbwcwebapp.model.Request;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

/**
 * @author dillon
 *
 */
public class DBRequestProxy implements DBProxyInterface {

	private MongoCollection<Document> collection;
	private DBConnection connection;
	
	public DBRequestProxy(MongoCollection<Document> collection, DBConnection connection) {
		this.collection = collection;
		this.connection = connection;
	}

	@Override
	public Document getDocument(Document document) {
		if (document.containsKey("ticket") && document.containsKey("reqID")) {
			FindIterable<Document> iterable = collection.find(document);
			return iterable.first();
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
		if (document.containsKey("ticket")) {
			if (document.containsKey("reqID")) {
				if (getDocument(new Document().append("reqID", document.getString("reqID")).append("ticket", document.getString("ticket"))) == null) {
					collection.insertOne(document);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
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

	public ArrayList<Request> getAllRequests(Document document) {
		ArrayList<Request> requestList = new ArrayList<Request>();
		MongoCursor<Document> cursor = collection.find(document).iterator();
		while (cursor.hasNext()) {
			requestList.add(new Request(cursor.next()));
		}
		cursor.close();
		return requestList;
	}

	@Override
	public void closeDBConnection() {
		connection.getClient().close();
	}
}
