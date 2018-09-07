/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import com.dsoft.qbwcwebapp.model.Request;
import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.ArrayList;

/**
 * @author dillon
 *
 */
public class DBRequestProxy implements DBProxyInterface {

	private MongoCollection<Document> collection;
	
	public DBRequestProxy(MongoCollection<Document> collection) {
		this.collection = collection;
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
				if (getDocument(new Document().append("reqID", document.getLong("reqID")).append("ticket", document.getString("ticket"))) == null) {
					collection.insertOne(document);
					return true;
				} else {
					return false;
				}
			} else {
				document.put("reqID", getNewestID(new Document().append("ticket", document.getString("ticket"))) + 1);
				collection.insertOne(document);
				return true;
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
	
	public long getNewestID(Document document) {
		long id = -1;
		MongoCursor<Document> cursor = collection.find(document).iterator();
		while (cursor.hasNext()) {
			Document tmpDocument = cursor.next();
			if (tmpDocument.getLong("reqID") > id) {
				id = tmpDocument.getLong("reqID");
			}
		}
		cursor.close();
		return id;
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
}
