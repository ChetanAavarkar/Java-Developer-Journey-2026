package Day52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String username = "root";
		String password = "Root@123";
		
		String sql = "DELETE FROM student WHERE id = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, 3);
			
			int rowsDeleted = ps.executeUpdate();
			
			if (rowsDeleted > 0) {
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("No student found with id = 3.");
			}
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}