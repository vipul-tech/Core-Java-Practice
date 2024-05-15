package inputoutput;

import java.io.Console;

public class ConsoleClassExample {

	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Enter your name : ");
		String name = c.readLine();
		System.out.println("Welcome " + name);
		
		System.out.println("Enter password : ");
		char[] carr = c.readPassword();
		String psw = carr.toString();
		System.out.println("Password : " + psw);
		
	}

}
