package com.connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class DemoInsert {

	public static void main(String[] args) {

		Connection con = MyConnection.openConnection();

		String SQL_INSERT = "insert into Book values(70,'Wicked 1.0', 'Godrej publication', 'Author 4', 41.11)";
		try {
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			int rows = st.executeUpdate(SQL_INSERT);
			con.commit();
			if (rows > 0) {
				System.out.println("rows added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}