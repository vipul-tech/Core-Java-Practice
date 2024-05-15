package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample4 {

	public static void main(String[] args) {
		Map<Integer,Book1> map=new TreeMap<Integer,Book1>();    
		//Creating Books    
		Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);    
		//Adding Books to map   
		map.put(2,b2);  
		map.put(1,b1);  
		map.put(3,b3);  

		//Traversing map  
		for(Map.Entry<Integer, Book1> entry:map.entrySet()){    
			int key=entry.getKey();  
			Book1 b=entry.getValue();  
			System.out.println(key+" Details:");  
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		}    
	}

}
