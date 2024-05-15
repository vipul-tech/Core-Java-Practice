package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionManagement2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vipuldb", "root", "root");
		conn.setAutoCommit(false);

		PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");  

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  

			System.out.println("Enter EmpId : ");  
			String s1=br.readLine();  
			int id=Integer.parseInt(s1);  

			System.out.println("Enter EmpName : ");  
			String name=br.readLine();  

			System.out.println("Enter EmpAge : ");  
			String s3=br.readLine();  
			int age=Integer.parseInt(s3);  
			
			System.out.println("Enter EmpDept : ");  
			String dept=br.readLine();  

			ps.setInt(1,id);  
			ps.setString(2,name);  
			ps.setInt(3,age);
			ps.setString(4, dept);
			
			ps.executeUpdate();  

			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit")){  
				conn.commit();  
			}  
			if(answer.equals("rollback")){  
				conn.rollback();  
			}  

			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
				break;  
			}  

		}  
		conn.commit();  
		System.out.println("record successfully saved");  

		conn.close();
	}

}
