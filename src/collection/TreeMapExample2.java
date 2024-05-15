package collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		NavigableMap<Integer, String> nm = new TreeMap<>();
		nm.put(1, "Mango");
		nm.put(2, "Orange");
		nm.put(3, "Grapes");
		nm.put(4, "Guava");
		nm.put(5, "Apple");
		
		System.out.println(nm.entrySet());
		System.out.println("Descending order : " + nm.descendingMap());
		System.out.println("Head Map : " + nm.headMap(4, false));
		System.out.println("Tail Map : " + nm.tailMap(2, false));
		System.out.println("Sub Map : " + nm.subMap(2, false, 4, true));
	}

}
