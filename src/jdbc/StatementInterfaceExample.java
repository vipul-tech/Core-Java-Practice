package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementInterfaceExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate("delete from employee where EmpId=3");
		System.out.println("Rows affected : " + result);
		conn.close();
	}

}
