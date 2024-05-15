package inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\IOStream\\file3.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello, Welcome to Nalanda!");
			bw.close();
			fw.close();
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
