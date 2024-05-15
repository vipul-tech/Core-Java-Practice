package exception;

public class ExceptionHandling1 {
	
	public static void main(String []args) {
		int i = 10;
		int j = 0;
		int data;
		try {
			data = i/j;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Don't divide by zero");
			System.out.println("Exception handled...");
			System.out.println(i/(j+2));
		}
		System.out.println("Rest of the code");
	}

}
