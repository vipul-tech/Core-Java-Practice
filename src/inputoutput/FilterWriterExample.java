package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

class CustomFilterWriter extends FilterWriter {  
	CustomFilterWriter(Writer out) {  
		super(out);  
	}  
	public void write(String str) throws IOException {  
		super.write(str.toLowerCase());  
	}  
}  

public class FilterWriterExample {

	public static void main(String[] args) {
		try {  
			FileWriter fw = new FileWriter("G:\\IOStream\\Record.txt");   
			CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
			filterWriter.write("I LOVE MY COUNTRY");  
			filterWriter.close();  
			FileReader fr = new FileReader("G:\\IOStream\\Record.txt");  
			BufferedReader bufferedReader = new BufferedReader(fr);  
			int k;  
			while ((k = bufferedReader.read()) != -1) {  
				System.out.print((char) k);  
			}  
			bufferedReader.close();  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  
	}

}
