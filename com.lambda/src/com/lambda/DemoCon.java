package com.lambda;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DemoCon {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=citi", "sa", "sa123");
		

	}

}
