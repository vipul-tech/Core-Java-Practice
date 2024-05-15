package exception;

import java.io.IOException;

public class ExceptionHandling7 {
	
	public static void method() throws IOException {
		throw new IOException("Device error...");
	}
	
	public static void main(String args[]) throws IOException {
		method();
//		try {
//			method();
//		}
//		catch(IOException e) {
//			System.out.println("Exception handled...");
//		}
		System.out.println("Rest of the code...");
	}
}
