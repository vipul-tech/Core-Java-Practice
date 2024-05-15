package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementInterfaceExample1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate("INSERT INTO employee VALUES(3, \"Rohit Kumar\", 27, \"IT\")");
		System.out.println("Inserted? " + result);
		conn.close();
	}

}
