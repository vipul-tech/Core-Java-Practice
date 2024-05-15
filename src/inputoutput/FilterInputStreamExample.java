package inputoutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamExample {

	public static void main(String[] args) {
		File file = new File("G:\\IOStream\\file.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			FilterInputStream flis = new BufferedInputStream(fis);
			int k = 0;
			while(k!=-1) {
				k = flis.read();
				System.out.print((char)k);
			}
			flis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
