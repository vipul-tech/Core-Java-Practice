package exception;

public class ExceptionHandling2 {
	public static void main(String args[]) {
		try {
			int arr[] = new int[5];
			//System.out.println(arr[5]);
			//arr[5] = 10/0;
			String name = null;
			System.out.println("Length of string " + name.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs...");
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("ArrayIndexOutOfBounds exception occurs...");
		}
		catch(Exception e) {
			System.out.println("Parent exception occurs...");
		}
		System.out.println("Rest of the code....");
	}
}
