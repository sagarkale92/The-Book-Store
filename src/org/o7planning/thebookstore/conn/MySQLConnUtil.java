package org.o7planning.thebookstore.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtil {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
		String hostName = "localhost";
		String dbName = "thebookstore";
		String userName = "root";
		String password = "123456";
		return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName,
	        String userName, String password) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		String connectionURL = "jdbc:mysql://"+hostName+":3306"+dbName;
		conn = DriverManager.getConnection(connectionURL,userName,password);
		return conn;
	}
}
