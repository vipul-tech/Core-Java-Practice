package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		CallableStatement cs = conn.prepareCall("{call insertrecord(?,?,?,?)}");
		cs.setInt(1, 7);
		cs.setString(2, "Manjit Singh");
		cs.setInt(3, 29);
		cs.setString(4, "Operation");
		
		cs.execute();
		System.out.println("Success...");
	}

}
