package java8;

//Classname and filename should be same if class is public otherwise no.
//We can't have more than one public class in a java file.
//.class file is generated for all the classes present in the java file.
//We can call main() method after program has started executing.
//First time main() method is called by JVM but after that we can call main() method any number of times from other function or the main function.
//Compiler adds default constructor in a class

class X{
	public static void main(String[] args){
		System.out.println("Hello World! from X");
		Y.main(args);
		Z.main(args);
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			System.out.println(e);
		}
		X.main(args);
	}
}

class Y{
	public static void main(String[] args){
		System.out.println("Hello World! from Y");
	}
}

class Z{
	public static void main(String[] args){
		System.out.println("Hello World! from Z");
	}
}

//Compiler creates .class file for interface also.
//Compiler adds public, static & final before variables in interface and public & abstract before methods of interface.

interface I{
	int x = 10;
	void abc();
}


