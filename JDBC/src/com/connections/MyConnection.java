package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection con;
	public static Connection openConnection() {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded successfully");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=citi", "sa", "sa123");


			DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=citi", "sa","sa123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;

	}
}
