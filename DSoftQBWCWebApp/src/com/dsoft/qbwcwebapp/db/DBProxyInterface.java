/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import org.bson.Document;

/**
 * @author dillon
 *
 */
public interface DBProxyInterface {

	public Document getDocument(Document document);
	
	public void deleteDocument(Document document);
	
	public void updateDocument(Document document, Document updatedDocument);
	
	public boolean createDocument(Document document);
	
	public Document getLastDocument();
	
	public long getCollectionSize();
}
