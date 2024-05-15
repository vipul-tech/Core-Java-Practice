package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin1 = new FileInputStream("G:\\IOStream\\testin1.txt");
			FileInputStream fin2 = new FileInputStream("G:\\IOStream\\testin2.txt");
			SequenceInputStream sis = new SequenceInputStream(fin2, fin1);
			FileOutputStream fout = new FileOutputStream("G:\\IOStream\\testout.txt");
			int i=0;
			while(i!=-1) {
				i = sis.read();
				System.out.print((char)i);
				fout.write(i);
			}
			fout.close();
			sis.close();
			fin1.close();
			fin2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
