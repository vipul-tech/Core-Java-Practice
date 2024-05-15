package collection;

import java.util.ArrayList;
import java.util.Collections;

class Studs implements Comparable<Studs>{
	int rollno;
	String name;
	int age;
	public Studs(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Studs s) {
		if(age>s.age)
			return 1;
		else if(age<s.age)
			return -1;
		else
			return 0;
	}
}

public class ComparableExample {

	public static void main(String[] args) {
ArrayList<Studs> studList = new ArrayList<>();
		
		Studs s1 = new Studs(1, "Mohan", 26);
		Studs s2 = new Studs(2, "Ankit", 31);
		Studs s3 = new Studs(3, "Rohan", 22);
		Studs s4 = new Studs(4, "Ganesh", 24);
		Studs s5 = new Studs(5, "Sukesh", 27);
		
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		
		System.out.println("Original student list : " );
		for(Studs s : studList)
			System.out.println(s.name + " " + s.age);
		
		System.out.println();
		Collections.sort(studList);
		System.out.println("Sorted student list : " );
		for(Studs s : studList)
			System.out.println(s.name + " " + s.age);
		
		System.out.println();
		Collections.sort(studList, Collections.reverseOrder());
		System.out.println("Sorted student list in reverse order : " );
		for(Studs s : studList)
			System.out.println(s.name + " " + s.age);
	}

}
