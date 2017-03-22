package org.o7planning.thebookstore.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class connectionUtils {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		return MySQLConnUtil.getMySQLConnection();
	}
	
	public static void close(Connection conn){
		try{
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void rollBack(Connection conn){
		try{
			conn.rollback();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
