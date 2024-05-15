package jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating and Executing RowSet  
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
		rowSet.setUrl("jdbc:mysql://localhost:3306/vipuldb");  
		rowSet.setUsername("root");  
		rowSet.setPassword("root");  

		rowSet.setCommand("select * from employee");  
		rowSet.execute();  

		while (rowSet.next()) {  
			// Generating cursor Moved event  
			System.out.println("Emp Id: " + rowSet.getInt(1));  
			System.out.println("Name: " + rowSet.getString(2));  
			System.out.println("Age: " + rowSet.getInt(3));  
			System.out.println("Department: " + rowSet.getString(4)); 
			System.out.println("-----------------");
		}  
	}

}
