package inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringWriterExample {

	public static void main(String[] args) throws IOException {
		char[] ary = new char[512];  
		StringWriter writer = new StringWriter();  
		FileInputStream input = null;  
		BufferedReader buffer = null;  
		input = new FileInputStream("G:\\IOStream\\file.txt");  
		buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
		int x;  
		while ((x = buffer.read(ary)) != -1) {  
			writer.write(ary, 0, x);  
		}  
		System.out.println(writer.toString());        
		writer.close();  
		buffer.close();  
	}

}
