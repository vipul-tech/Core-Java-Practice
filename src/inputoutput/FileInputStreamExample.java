package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("G:\\IOStream\\testing.txt");
			System.out.println("Number of avialable characters to read : "+fin.available());
			int i = fin.read();
			System.out.println((char)i);
			
			int j = 0;
			while(j!=-1) {
				j=fin.read();
				System.out.print((char)j);
			}
			
			System.out.println();
			System.out.println("Number of avialable characters to read : "+fin.available());
			
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
