package com.h2kinfosys.learn.dayTwelve;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) throws SQLException {
		String query = "select * from sakila.city";
		Connection conn = null;
		try {
		 conn = TestConnection.getConnection();
		 // 4 - Create Statement
		 Statement stat = conn.createStatement();
		 // Execute a Query  Step 5 = Get the result from DB
		 ResultSet rs = stat.executeQuery(query);
		 
		 if(rs != null) {
			 System.out.println("You got the result from DB  " + rs);
		 }
		 
		 
		}catch(SQLException sql) {
			sql.printStackTrace();
		}finally {
			if(conn != null) conn.close();
		}

	}

}
