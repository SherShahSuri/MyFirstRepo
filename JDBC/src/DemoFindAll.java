import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.connections.book;

public class DemoFindAll {
	public static void main(String[] args) {
		Connection con=MyConnection.openConnection();
		
		
		String sql_findall="Select * from book";
		
		try {
			DatabaseMetaData databaseMetaData=con.getMetaData();
			String dbName=databaseMetaData.getDatabaseProductName();
			System.out.println("db name:"+ dbName);
			System.out.println("driver name:" +databaseMetaData.getDriverName());
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			con=MyConnection.openConnection();
			
			
			List<book> books = new ArrayList<>();
			
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(sql_findall);
			
			while(set.next()) {
				System.out.println("isbn is ="+set.getInt(1)+
						"\tBookname is ="+set.getString(2)+
						"\tPublication is ="+set.getString(3)+
						"\tAuthor is ="+set.getString(4)+
						"\tPrice is ="+set.getDouble(5));
				book Book=new book(set.getString(2),set.getInt(1),set.getDouble(5));
				books.add(Book);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
