package conversion;

class Employee{
	int id;
	String name;
	int age;
	
	Employee(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class ObjectStringConversion {

	public static void main(String[] args) throws ClassNotFoundException {
		String s = "Hello";
		Object obj = s;
		System.out.println(obj);
		
		Class c = Class.forName("java.lang.String");
		System.out.println("Class name : " + c.getName());
		System.out.println("Super class name : " + c.getSuperclass().getName());
		
		System.out.println("Object to String Conversion");
		Employee e = new Employee(1, "Vipul Kumar", 24);
		String s1 = e.toString();
		System.out.println(s1);
		String s2 = String.valueOf(e);
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s3 = sb.toString();
		System.out.println(s3);
	}

}
