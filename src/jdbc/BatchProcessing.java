package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		conn.setAutoCommit(false);
		
		Statement stmt=conn.createStatement();  
		stmt.addBatch("INSERT INTO employee VALUES(15, 'Somesh Singh', 26, 'IT');");  
		stmt.addBatch("INSERT INTO employee VALUES(14, 'Pinky Kumari', 22, 'HR');");  
		  
		stmt.executeBatch();//executing the batch  
		  
		conn.commit();  
		conn.close();  
		System.out.println("Success...");
	}

}
