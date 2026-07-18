package Day48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String username = "root";
		String password = "Root@123";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement stmt = con.createStatement();
			
			String sql = "INSERT INTO student VALUES (3, 'Chetan', 'Ahmedabad')";
			
			int rows = stmt.executeUpdate(sql);
			
			System.out.println(rows + " record inserted successfully!");
			
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}