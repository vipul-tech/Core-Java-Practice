package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		int a=10;
		a *= 2+3;
		System.out.println(a);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vipul", 54);
		map.put("Sunny", 52);
		map.put("Rashi", 51);
		map.put("Hitesh", 50);
		
		System.out.println("--------------HashMap----------------");
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		map1.put("Vipul", 54);
		map1.put("Sunny", 52);
		map1.put("Rashi", 51);
		map1.put("Hitesh", 50);
		
		System.out.println("--------------LinkedHashMap----------------");
		for(Map.Entry<String, Integer> m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("Vipul", 54);
		map2.put("Sunny", 52);
		map2.put("Rashi", 51);
		map2.put("Hitesh", 50);
		
		System.out.println("--------------TreeMap----------------");
		for(Map.Entry<String, Integer> m:map2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("---------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("--------Reverse Order-------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
}