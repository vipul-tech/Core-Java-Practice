package collection;

import java.util.EnumMap;
import java.util.Map;

enum key{
	one, two, three
}

public class EnumMapExample2 {

	public static void main(String[] args) {
		EnumMap<key,Books> em = new EnumMap<>(key.class);
		
		Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Books b3=new Books(103,"Operating System","Galvin","Wiley",6);    
		
		em.put(key.one, b1);
		em.put(key.two, b2);
		em.put(key.three, b3);
		
		for(Map.Entry<key, Books> entry:em.entrySet()){
            Books b=entry.getValue(); 
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);     
        }
	}

}
