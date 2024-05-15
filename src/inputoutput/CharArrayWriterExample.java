package inputoutput;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {

	public static void main(String[] args) throws IOException {
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("Java is an object-oriented language.");
		
		FileWriter fw1 = new FileWriter("G:\\IOStream\\a.txt");
		FileWriter fw2 = new FileWriter("G:\\IOStream\\b.txt");
		FileWriter fw3 = new FileWriter("G:\\IOStream\\c.txt");
		FileWriter fw4 = new FileWriter("G:\\IOStream\\d.txt");
		
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		caw.writeTo(fw3);
		caw.writeTo(fw4);
		
		fw1.close();
		fw2.close();
		fw3.close();
		fw4.close();
		System.out.println("Success");
	}

}
