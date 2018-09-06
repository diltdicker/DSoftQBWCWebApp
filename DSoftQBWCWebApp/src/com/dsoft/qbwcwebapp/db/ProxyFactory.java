/**
 * 
 */
package com.dsoft.qbwcwebapp.db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.bson.Document;

import com.dsoft.qbwcwebapp.exception.MissingConfigException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * @author dillon
 *
 */
public class ProxyFactory {

	private static ProxyFactory factory = null;
	private MongoClient client = null;
	private MongoDatabase database = null;
	
	private ProxyFactory() {
		Properties properties = new Properties();
		String configfile = "config.properties";
		InputStream stream = getClass().getClassLoader().getResourceAsStream(configfile);
		try {
			properties.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
			throw new MissingConfigException("missing file " + configfile);
		}
		String mongoURL = "mongodb://" + properties.getProperty("mongo_host", "localhost") +
				":" + properties.getProperty("mongo_port", "27017");
		client = MongoClients.create(mongoURL);
		database = client.getDatabase(properties.getProperty("mongo_db", "qbwc"));
	}
	
	public static ProxyFactory getFactory() {
		if (factory == null) {
			factory = new ProxyFactory();
		}
		return factory;
	}
	
	public AccountProxy getAccounts() {
		MongoCollection<Document> collection = getFactory().database.getCollection("accounts");
		if (collection == null) {
			getFactory().database.createCollection("accounts");
			collection = getFactory().database.getCollection("accounts");
		}
		return new AccountProxy(collection);
	}
	
	public RequestProxy getRequests() {
		MongoCollection<Document> collection = getFactory().database.getCollection("requests");
		if (collection == null) {
			getFactory().database.createCollection("requests");
			collection = getFactory().database.getCollection("requests");
		}
		return new RequestProxy(collection);
	}
	
	public ResponseProxy getResponses() {
		MongoCollection<Document> collection = getFactory().database.getCollection("responses");
		if (collection == null) {
			getFactory().database.createCollection("responses");
			collection = getFactory().database.getCollection("responses");
		}
		return new ResponseProxy(collection);
	}
}
