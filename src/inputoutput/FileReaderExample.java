package inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
			File file = new File("G:\\IOStream\\file2.txt");
			FileReader fr = new FileReader(file);
			int k=0;
			while((k=fr.read())!=-1) {
				System.out.print((char)k);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
