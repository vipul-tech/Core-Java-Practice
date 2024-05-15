package inputoutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("G:\\IOStream\\f1.txt");
			FileOutputStream fout2 = new FileOutputStream("G:\\IOStream\\f2.txt");
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			String str = "Welcome to Bihar!";
			byte[] b = str.getBytes();
			
			bout.write(b);
			bout.writeTo(fout);
			bout.writeTo(fout2);
			bout.close();
			fout.close();
			fout2.close();
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
