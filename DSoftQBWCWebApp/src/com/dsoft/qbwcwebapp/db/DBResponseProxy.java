/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

/**
 * @author dillon
 *
 */
public class DBResponseProxy implements DBProxyInterface {

	private MongoCollection<Document> collection;
	
	public DBResponseProxy(MongoCollection<Document> collection) {
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
		if (document.containsKey("reqID")) {
			if (getDocument(new Document().append("reqID", document.getLong("reqID"))) == null) {
				collection.insertOne(document);
				return true;
			} else {
				return false;
			}
		} else {
			document.put("reqID", getNewestID());
			collection.insertOne(document);
			return true;
		}
	}

	@Override
	public Document getLastDocument() {
		return collection.find().first();
	}

	@Override
	public long getCollectionSize() {
		return collection.countDocuments();
	}

	@Override
	public void updateDocument(Document document, Document updatedDocument) {
		collection.findOneAndReplace(document, updatedDocument);
	}
	
	public long getNewestID() {
		long id = -1;
		MongoCursor<Document> cursor = collection.find().iterator();
		while (cursor.hasNext()) {
			Document tmpDocument = cursor.next();
			if (tmpDocument.getLong("reqID") > id) {
				id = tmpDocument.getLong("reqID");
			}
		}
		cursor.close();
		return id;
	}
}
