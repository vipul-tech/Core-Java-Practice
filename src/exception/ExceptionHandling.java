package exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
			int data=100/0;  
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			String name = "Vipul";
			int value = Integer.parseInt(name);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		try {
			int num[] = new int[5];
			num[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code....");
	}
}
