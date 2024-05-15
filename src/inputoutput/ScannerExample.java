package inputoutput;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		
		Scanner sc2 = new Scanner("Hello, This is Java Tutorial.");
		System.out.println(sc2.hasNext());
		System.out.println(sc2.nextLine());
		sc2.close();
		
		System.out.println("ENTER DETAILS");
		System.out.print("Enter your name : ");
		String name2 = sc.next();
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		System.out.print("Enter salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Name " + name2);
		System.out.println("Age " + age);
		System.out.println("Salary : " + salary);
		sc.close();
	}

}
