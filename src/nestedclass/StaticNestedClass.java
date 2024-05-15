package nestedclass;

class Outer1{
	static int data = 12;
	static class Inner{
		void message() {
			System.out.println(data);
		}
		static void other() {
			System.out.println("Other method "+data);
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		Outer1.Inner in = new Outer1.Inner();
		in.message();
		Outer1.Inner.other();
	}

}
