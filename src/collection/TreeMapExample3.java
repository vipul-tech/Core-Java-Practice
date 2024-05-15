package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(2, "Mumbai");
		sm.put(3, "Bengaluru");
		sm.put(1, "Delhi");
		sm.put(5, "Kolkata");
		sm.put(4, "Hyderabad");
		
		System.out.println("Initial Map : " + sm.entrySet());
		System.out.println("Head Map : " + sm.headMap(3));
		System.out.println("Tail Map : " + sm.tailMap(3));
		System.out.println("Sub Map : " + sm.subMap(2, 4));
	}

}
