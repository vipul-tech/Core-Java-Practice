package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\IOStream\\file2.txt");
			String str = "Hello everyone, This is Vipul Kumar";
			fw.write(str);
			fw.close();
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
