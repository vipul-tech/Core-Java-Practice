package exception;

import java.io.IOException;

public class ExceptionHandling6 {
	
	public static void munchecked() {
		int data = 25/0;
		System.out.println(data);
	}
	
	public static void nunchecked() {
		munchecked();
	}
	
	public static void punchecked() {
		try {
			nunchecked();
		}catch(Exception e) {
			System.out.println("exception handled unchecked..");
		}
	}

	public static void mchecked() throws IOException {
		throw new IOException("IO Exception");
	}
	
	public static void nchecked() throws IOException {
		mchecked();
	}
	
	public static void pchecked() {
		try {
			nchecked();
		}catch(IOException e) {
			System.out.println("exception handled checked..");
		}
	}

	public static void main(String[] args) {
		punchecked();
		pchecked();
		System.out.println("normal flow...");  

	}

}
