package jdbc;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreFileExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO FILETABLE VALUES(?,?)");
		File f=new File("C:\\Users\\hp\\Desktop\\BanglorePalace\\hello.txt");  
		FileReader fr=new FileReader(f);  
		              
		ps.setString(1,"hello");  
		ps.setCharacterStream(2,fr,(int)f.length());
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		              
		conn.close();
	}

}
