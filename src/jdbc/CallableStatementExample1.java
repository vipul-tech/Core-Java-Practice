package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementExample1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		CallableStatement cs = conn.prepareCall("{? = call calculate_sum(?)}");
		cs.setString(2, "EmpAge");
		cs.registerOutParameter(1,Types.INTEGER);  
		cs.execute();  
		  
		System.out.println(cs.getInt(1));  
	}

}
