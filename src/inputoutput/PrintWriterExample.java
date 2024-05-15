package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("Welcome to Java Tutorial");
		pw.flush();
		pw.close();

		//Data to write in File using PrintWriter       
		PrintWriter writer1 =null;      
		writer1 = new PrintWriter(new File("G:\\IOStream\\abc.txt"));
		writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
		writer1.flush();  
		writer1.close(); 
	}

}
