package exception;

//class MyCustomException extends Exception{
//	
//}
//
//public class CustomException {
//
//	public static void main(String[] args) {
//		
//		try {
//			throw new MyCustomException();
//		}
//		catch(MyCustomException e) {
//			System.out.println("Caught the exception");  
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Rest of the code...");
//	}
//
//}


class MyCustomException extends Exception{
	public MyCustomException(String errorMessage) {
		super(errorMessage);
	}
}

public class CustomException {
	
	public static void validate(int age) throws MyCustomException {
		if(age<18) {
			throw new MyCustomException("Age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		
		try {
			validate(16);
		}
		catch(MyCustomException e) {
			System.out.println("Caught the exception");  
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code...");
	}

}