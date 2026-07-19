package Day49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user = "root";
		String password = "Root@123";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			String sql = "SELECT id, name, city FROM student";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("City: " + city);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}