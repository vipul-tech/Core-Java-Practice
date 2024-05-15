package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(100, "Saurav");
		tm.put(103, "Manish");
		tm.put(104, "Rishav");
		tm.put(101, "Sanjana");
		tm.put(102, "Subham");
		
		System.out.println(tm);
		
		for(Map.Entry<Integer, String> m : tm.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		System.out.println("Before invoking remove() method");
		for(Map.Entry<Integer, String> m : tm.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		tm.remove(103);
		System.out.println("After invoking remove(key) method");
		for(Map.Entry<Integer, String> m : tm.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		tm.remove(101, "Sanjana");
		System.out.println("After invoking remove(key,value) method");
		for(Map.Entry<Integer, String> m : tm.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
	}

}
