package nestedclass;

class Outer{
	private int data = 25;
	public class Inner{
		void message() {
			System.out.println(data);
		}
	}
}
  
public class MemberInnerClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.message();
		
	}
	
}
