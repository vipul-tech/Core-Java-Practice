package inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("G:\\IOStream\\testing1.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i =0;
			while(i!=-1) {
				i = bin.read();
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
