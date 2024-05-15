package exception;

import java.io.FileNotFoundException;

class UserDefinedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedException(String str) {
		super(str);
	}
}

public class ExceptionHandling5 {
	
	//throwing unchecked exception
//	public static void validate(int age) {
//		if(age<18)
//			throw new ArithmeticException("Person is not eligible to vote");
//		else
//			System.out.println("Person is eligible to vote");
//	}
//	public static void main(String args[]) {
//		validate(15);
//		System.out.println("Rest of the code....");
//	}
	
	//throwing checked exception
//	public static void method() throws FileNotFoundException {
//		throw new FileNotFoundException();
//	}
//	
//	public static void main(String args[]) {
//		try {
//			method();
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Rest of the code....");
//	}
	
	//throwing user-defined exception
	public static void method() throws UserDefinedException {
		throw new UserDefinedException("This is user-defined exception");
	}
	
	public static void main(String args[]) {
		try {
			method();
		}
		catch(UserDefinedException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code....");
	}
	
}
