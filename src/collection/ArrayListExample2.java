package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Student> sl = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Raunak", 24);
		Student s2 = new Student(102, "Aniket", 25);
		Student s3 = new Student(103, "Pawan", 28);
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		Iterator<Student> itr = sl.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
	}

}
