package nestedclass;

//interface Showable{
//	void show();
//	interface Message{
//		void message();
//	}
//}
//
//public class NestedInterface implements Showable.Message{
//
//	public static void main(String[] args) {
//		Showable.Message obj = new NestedInterface();
//		obj.message();
//	}
//
//	public void message() {
//		System.out.println("Hello nested interface");
//	}
//
//}

class A{
	interface Message{
		void message();
	}
}

public class NestedInterface implements A.Message{

	public static void main(String[] args) {
		A.Message obj = new NestedInterface();
		obj.message();
	}

	public void message() {
		System.out.println("Hello nested interface");
	}

}
