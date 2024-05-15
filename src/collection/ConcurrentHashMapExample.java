package collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> cmap = new ConcurrentHashMap<>();
		cmap.put("A", 10);
		cmap.put("B", 20);
		cmap.put("C", 30);
		cmap.put("D", 40);
		cmap.put("E", 50);
		
		System.out.println(cmap);
		
		System.out.println("HashMap values :\n" + cmap.toString());    
		cmap.computeIfAbsent("F", k -> 200 + 300);
		cmap.computeIfAbsent("G", k -> 60 * 10);   
        System.out.println("New HashMap after computeIfAbsent :\n"+ cmap);
        System.out.println(" Mappings are: " +cmap);   
        
        System.out.println("Is 600  present? " + cmap.containsValue(600)); 
	}

}
