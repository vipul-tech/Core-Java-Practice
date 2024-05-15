package inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		try {  
			Writer w = new FileWriter("G:\\IOStream\\output.txt");  
			String content = "I love my country";  
			w.write(content);  
			w.close();  
			System.out.println("Done");  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  
	}

}
