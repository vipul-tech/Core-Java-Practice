package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		HashSet<String> s1 = new LinkedHashSet<>();
		s1.add("Mango");
		s1.add("Banana");
		s1.add("Grapes");
		System.out.println(s1);
		
		List<String> l1 = new ArrayList<>();
		l1.add("Guava");
		l1.add("Apple");
		l1.add("Pears");
		l1.add("Apple");
		l1.add("Orange");
		
		s1.addAll(l1);
		System.out.println(s1);
		
		s1.remove("Apple");
		System.out.println(s1);
		
		s1.removeIf(str->str.contains("Banana"));
		System.out.println(s1);
		
		s1.removeAll(l1);
		System.out.println(s1);
		
		s1.clear();
		System.out.println(s1);
	}

}
