package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseMetaDataExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
		String table[]={"TABLE"};
		ResultSet rs=dbmd.getTables(null,null,null,table);
		
		while(rs.next()){
			System.out.println(rs.getString(3));
		}
		conn.close();
	}

}
