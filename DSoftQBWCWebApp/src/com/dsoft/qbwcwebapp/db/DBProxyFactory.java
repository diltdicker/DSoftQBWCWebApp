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
public interface DBProxyFactory {
	
	public static DBAccountProxy getAccounts() {
		DBConnection connection = new DBConnection();
		MongoCollection<Document> collection = connection.getDatabase().getCollection("accounts");
		if (collection == null) {
			connection.getDatabase().createCollection("accounts");
			collection = connection.getDatabase().getCollection("accounts");
		}
		return new DBAccountProxy(collection, connection);
	}
	
	public static DBRequestProxy getRequests() {
		DBConnection connection = new DBConnection();
		MongoCollection<Document> collection = connection.getDatabase().getCollection("requests");
		if (collection == null) {
			connection.getDatabase().createCollection("requests");
			collection = connection.getDatabase().getCollection("requests");
		}
		return new DBRequestProxy(collection, connection);
	}
	
	public static DBResponseProxy getResponses() {
		DBConnection connection = new DBConnection();
		MongoCollection<Document> collection = connection.getDatabase().getCollection("responses");
		if (collection == null) {
			connection.getDatabase().createCollection("responses");
			collection = connection.getDatabase().getCollection("responses");
		}
		return new DBResponseProxy(collection, connection);
	}
	
	public class DBConnection {
		private MongoClient client;
		private MongoDatabase database;
		
		public DBConnection() {
			Properties properties = new Properties();
			String configFile = "config.properties";
			InputStream stream = getClass().getClassLoader().getResourceAsStream(configFile);
			try {
				properties.load(stream);
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new MissingConfigException("missing file " + configFile);
			}
			String mongoURL = "mongodb://" + properties.getProperty("mongo_host", "localhost") +
					":" + properties.getProperty("mongo_port", "27017");
			client = MongoClients.create(mongoURL);
			database = client.getDatabase(properties.getProperty("mongo_db", "qbwc"));
		}

		/**
		 * @return the client
		 */
		public MongoClient getClient() {
			return client;
		}

		/**
		 * @return the database
		 */
		public MongoDatabase getDatabase() {
			return database;
		}
		
		
		
	}
}
