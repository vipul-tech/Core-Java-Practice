package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Orange");
		map.put(2, "Banana");
		map.put(3, "Grapes");
		map.put(3,"Banana");
		map.put(4, "Guava");
		
		System.out.println("After calling put() method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		System.out.println("After calling putIfAbsent() method");
		map.putIfAbsent(4, "Orange");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		System.out.println("After calling putAll() method");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(6, "Apple");
		map.putAll(map2);
		
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		map.remove(3);
		System.out.println("After calling remove(key) method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		map.remove(2, "Mango");
		System.out.println("After calling remove(key,value) method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		map.replace(1, "Mango");
		System.out.println("After calling replace(key,value) method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		map.replace(4, "Guava", "Grapes");
		System.out.println("After calling replace(key,oldValue, newValue) method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
		
		map.replaceAll((k,v)->"Orange");
		System.out.println("After calling replace(key,oldValue, newValue) method");
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
	}

}
