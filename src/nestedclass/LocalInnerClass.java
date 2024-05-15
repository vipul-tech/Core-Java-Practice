package nestedclass;

public class LocalInnerClass {
	private int data = 50;
	void display() {
		class Local{
			void message() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.message();
	}
	
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		lic.display();
	}
}
