package inputoutput;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {

	public static void main(String[] args) {
		char[] charr = {'j', 'a', 'v', 'a', 's', 'c', 'r', 'i', 'p', 't'};
		CharArrayReader car = new CharArrayReader(charr);
		int k=0;
		try {
			while((k=car.read())!=-1) {
				char c = (char)k;
				System.out.println(k + ":" + c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
