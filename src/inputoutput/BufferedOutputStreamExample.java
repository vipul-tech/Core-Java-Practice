package inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("G:\\IOStream\\testing1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String str = "Welcome to Java Tutorial";
			byte[] barr = str.getBytes();
			bout.write(barr);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success");  
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
