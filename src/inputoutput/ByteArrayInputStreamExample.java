package inputoutput;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		byte[] buffer = {65, 90, 97, 122, 35, 48, 57};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
		
		int k = 0;
		while((k = bis.read())!=-1) {
			char ch = (char)k;
			System.out.println("ASCII value of character is : " + k + " Character is : " + ch);
		}
	}

}
