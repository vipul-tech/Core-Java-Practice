package collection;

import java.util.ArrayList;
import java.util.Collections;

class Stud implements Comparable<Stud>{
	String name;
	public Stud(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Stud s) {
		return name.compareTo(s.name);
	}
}

public class SortingCollectionsExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Grapes");
		list.add("Pomegranate");
		list.add("Guava");
		
		System.out.println("Initial String list : " + list);
		
		Collections.sort(list);
		System.out.println("String list in sorted order : " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("String list in reverse order : " + list);
		
		ArrayList<Stud> studList = new ArrayList<>();
		
		Stud s1 = new Stud("Mohan");
		Stud s2 = new Stud("Ankit");
		Stud s3 = new Stud("Rohan");
		Stud s4 = new Stud("Ganesh");
		Stud s5 = new Stud("Sukesh");
		
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		
		System.out.print("Original student list : " );
		for(Stud s : studList)
			System.out.print(s.name + " ");
		
		System.out.println();
		Collections.sort(studList);
		System.out.print("Sorted student list : " );
		for(Stud s : studList)
			System.out.print(s.name + " ");
		
		System.out.println();
		Collections.sort(studList, Collections.reverseOrder());
		System.out.print("Sorted student list in reverse order : " );
		for(Stud s : studList)
			System.out.print(s.name + " ");
	}

}
