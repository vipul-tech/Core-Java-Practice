package inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("G:\\IOStream\\d1.txt");
			DataOutputStream dos = new DataOutputStream(fout);
			
			dos.writeInt(35);
			dos.writeChar(45);
			dos.flush();
			dos.close();
			System.out.println("Success...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
