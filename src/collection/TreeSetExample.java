package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();
		s.add("Delhi");
		s.add("Kolkata");
		s.add("Chennai");
		s.add("Bengaluru");
		s.add("Mumbai");
		
		System.out.println(s);
		
		List<String> l1 = new ArrayList<>();
		l1.add("Guava");
		l1.add("Apple");
		l1.add("Pears");
		l1.add("Apple");
		l1.add("Orange");
		
		s.addAll(l1);
		
		Iterator<String> itr1 = s.iterator();
		while(itr1.hasNext())
			System.out.print(itr1.next() + " ");
		
		System.out.println();
		Iterator<String> itr = s.descendingIterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
		System.out.println();
		System.out.println("Initial Set : " + s);
		System.out.println("Reversed Set : " + s.descendingSet());
		System.out.println("Subset : " + s.subSet("Bengaluru", true, "Orange", false));
		System.out.println("Headset : " + s.headSet("Delhi", true));
		System.out.println("Tailset : " + s.tailSet("Chennai", true));
		
		TreeSet<Integer> s1 = new TreeSet<>();
		s1.add(78);
		s1.add(23);
		s1.add(99);
		s1.add(56);
		s1.add(37);
		
		System.out.println(s1);
		System.out.println("Lowest element : " + s1.pollFirst());
		System.out.println("Largest element : " + s1.pollLast());
	}

}
