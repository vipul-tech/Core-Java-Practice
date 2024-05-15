package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("G:\\IOStream\\ab.txt");
		InputStreamReader isr = new InputStreamReader(is);
		
		int k=0;
		while((k=isr.read())!=-1) {
			char c = (char)k;
			System.out.print(c);
		}
		isr.close();
		is.close();
	}

}
