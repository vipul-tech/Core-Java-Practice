package exception;

class Parent{
	//does not declare any exception
	void message() {
		System.out.println("Parent method...");
	}
}

class Child extends Parent{
	//we can't declare checked exception
//	void message() throws IOException {
	//we can declare unchecked exception
	void message() throws ArithmeticException {
		System.out.println("Child method...");
	}
}

class Base{
	//declares an exception
	void message() throws IndexOutOfBoundsException{
		System.out.println("Parent method...");
	}
}

class Derived extends Base{
	//can't declare parent exception class of base class
//	void message() throws Exception {
	//same exception class can be declared
//	void message() throws IndexOutOfBoundsException{
	//we can also not declare exception in derived class
//	void message() {
	//subclass exception can be declared
	void message() throws ArrayIndexOutOfBoundsException{
		System.out.println("Child method...");
	}
}


public class ExceptionHandling9 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.message();
	}
}
