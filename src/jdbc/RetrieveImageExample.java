package jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImageExample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM IMGTABLE1");
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
			FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\Desktop\\BanglorePalace\\a2.jpg");  
			fout.write(barr);  
		              
			fout.close();  
		}//end of if  
		System.out.println("ok");  
		              
		conn.close();  
	}

}
