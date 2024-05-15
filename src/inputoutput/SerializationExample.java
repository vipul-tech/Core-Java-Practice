package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student(1, "Vipul", 24);
		FileOutputStream fout = new FileOutputStream("G:\\IOStream\\testFile2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("Success");
		
		FileInputStream fin = new FileInputStream("G:\\IOStream\\testFile2.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		Student s2 = (Student)ois.readObject();
		System.out.println(s2.id + " " + s2.name + " " + s2.age);
		ois.close();
	}

}
