package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		PreparedStatement stmt = conn.prepareStatement("insert into employee values(?,?,?,?)");
		
		stmt.setInt(1, 4);
		stmt.setString(2, "Sonam Kumari");
		stmt.setInt(3, 23);
		stmt.setString(4, "Security");
		
		int updated = stmt.executeUpdate();
		System.out.println("Rows affected : " + updated);
		conn.close();
	}

}
