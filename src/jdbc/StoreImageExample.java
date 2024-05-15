package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreImageExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO IMGTABLE1 VALUES(?,?)");
		ps.setString(1, "image1");
		FileInputStream fin=new FileInputStream("C:\\Users\\hp\\Desktop\\BanglorePalace\\fr.jpg");
		ps.setBinaryStream(2,fin,fin.available());
		int i=ps.executeUpdate();
		System.out.println(i+" records affected");  
		conn.close(); 
	}

}
