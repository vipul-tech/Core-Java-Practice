package inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamExample {

	public static void main(String[] args) {
		try {
			File file = new File("G:\\IOStream\\file.txt");
			FileOutputStream fos = new FileOutputStream(file);
			FilterOutputStream flos = new FilterOutputStream(fos);
			String str = "Hello Mumbai!";
			byte[] b = str.getBytes();
			flos.write(b);
			flos.flush();
			flos.close();
			fos.close();
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
