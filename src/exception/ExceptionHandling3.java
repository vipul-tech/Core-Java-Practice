package exception;

public class ExceptionHandling3 {
	//1st program
//	public static void main(String abc[]) {
//		try {
//			try {
//				System.out.println("going to divide by 0");    
//				int b =39/0;    
//			}
//			catch(ArithmeticException e) {
//				System.out.println(e);
//			}
//
//			try {
//				int a[]=new int[5];      
//				a[5]=4;  
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
//			}
//
//			System.out.println("Other statement");
//		}
//		catch(Exception e) {
//			System.out.println("Handled the exception outer catch block");
//		}
//		System.out.println("Normal flow...");
//	}
	//2nd program
	public static void main(String args[]) {
		try {
			try {
				try {
					int arr[] = new int[5];
					arr[10] = 78;
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception occured...");
					System.out.println("inner try block 2");
				}
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception occured...");
				System.out.println("inner try block 1");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("outer (main) try block");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("handled in main try-block");
		}
	}
}
