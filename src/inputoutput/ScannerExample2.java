package inputoutput;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		String str = "Hello/This is Java Tutorial/My name is Vipul Kumar";
		Scanner sc = new Scanner(str);
		boolean result = sc.hasNextBoolean();
		System.out.println("Boolean result : " + result);
		
//		while(sc.hasNext()) {
//			System.out.println(sc.next());
//		}
		
		System.out.println("---Tokenizes String---");  
		sc.useDelimiter("/");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		System.out.println("Delimiter used : " + sc.delimiter());
		sc.close();
	}

}
