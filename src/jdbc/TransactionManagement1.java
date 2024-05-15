package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionManagement1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("INSERT INTO employee VALUES(10, 'Ramesh Singh', 26, 'HR');");
		stmt.executeUpdate("INSERT INTO employee VALUES(12, 'Sneha Raj', 28, 'IT');");
		
		conn.commit();
		conn.close();
		
		System.out.println("Successfully inserted...");
	}

}
