package db;

import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;

public class DBConnectionFactory {

	// This should change based on the pipeline.
	//private static final String DEFAULT_DB = "mongodb";
	private static final String DEFAULT_DB = "mysql";

	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return new MySQLConnection(); // return new MySQLConnection();
		case "mongodb":
			return new MongoDBConnection();
		default:  // neither case
			throw new IllegalArgumentException("Invalid db" + db);
		}
	}

	public static DBConnection getDBConnection() { // no parameter case
		return getDBConnection(DEFAULT_DB);
	}
}

