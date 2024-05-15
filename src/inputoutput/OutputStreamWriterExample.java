package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("G:\\IOStream\\ab.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write("Hello World! ");
		osw.write(65);
		osw.close();
		System.out.println("Success");
	}

}
