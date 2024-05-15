package inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("G:\\IOStream\\testing1.txt");
			DataInputStream dis = new DataInputStream(is);
			int count = dis.available();
			byte[] arr = new byte[count];
			dis.read(arr);
			for(byte b : arr) {
				char ch = (char)b;
				System.out.println(b + " - " + ch);
			}
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
