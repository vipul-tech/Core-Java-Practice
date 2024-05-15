package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		PreparedStatement stmt = conn.prepareStatement("select * from employee");
		ResultSet rs=stmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Total columns: " + rsmd.getColumnCount());
		System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
		System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
	}

}
