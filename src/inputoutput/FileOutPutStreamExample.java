package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("G:\\IOStream\\testing.txt");
			
			fout.write(65);
			fout.write(70);
			
			String s = "\nHello World!\n";
			byte[] b = s.getBytes();
			fout.write(b);
			
			fout.write(b, 0, 5);
			
			fout.close();
			
			System.out.println("Success");
			
			System.out.println(fout.getChannel());
			System.out.println(fout.getFD());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
