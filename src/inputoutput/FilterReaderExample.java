package inputoutput;

import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

class CustomFilterReader extends FilterReader {  
	CustomFilterReader(Reader in) {  
		super(in);  
	}  
	public int read() throws IOException {  
		int x = super.read();  
		if ((char) x == ' ')  
			return ((int) '?');  
		else  
			return x;  
	}  
}  

public class FilterReaderExample {

	public static void main(String[] args) {
		try  {  
			Reader reader = new FileReader("G:\\IOStream\\Record.txt");  
			CustomFilterReader fr = new CustomFilterReader(reader);  
			int i;  
			while ((i = fr.read()) != -1) {  
				System.out.print((char) i);  
			}  
			fr.close();  
			reader.close();  
		} catch (Exception e) {  
			e.getMessage();  
		}  
	}  

}
