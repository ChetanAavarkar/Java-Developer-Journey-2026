package Day51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String username = "root";
		String password = "Root@123";
		
		String sql = "UPDATE student SET city = ? WHERE id = ?";
		
		try {
			Connection  conn = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "Ahmedabad");
			ps.setInt(2, 2);
			
			int rows = ps.executeUpdate();
			System.out.println(rows + " row(s) updated.");
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}