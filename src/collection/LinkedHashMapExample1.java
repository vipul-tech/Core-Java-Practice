package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<>();
		lh.put(100, "Saurav");
		lh.put(103, "Manish");
		lh.put(104, "Rishav");
		lh.put(101, "Sanjana");
		lh.put(102, "Subham");

		for(Map.Entry<Integer, String> m : lh.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());

		System.out.println("Keys : " + lh.keySet());
		System.out.println("Values : " + lh.values());
		System.out.println("Key-Value pair : " + lh.entrySet());

		System.out.println("Before invoking remove() method: "+lh);     
		lh.remove(104); 
		System.out.println("After invoking remove() method: "+lh.entrySet());   
	}

}
