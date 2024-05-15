package collection;

import java.util.ArrayDeque;
import java.util.Deque;

class Books {
	int id;
	String name,author,publisher;
	int quantity;
	public Books(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;    
		this.author = author;    
		this.publisher = publisher;    
		this.quantity = quantity;    
	}
}

public class ArrayDequeExample2 {

	public static void main(String[] args) {
		Deque<Books> set=new ArrayDeque<Books>();    
		  
		Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Books b3=new Books(103,"Operating System","Galvin","Wiley",6);    
		
		set.add(b1);    
		set.add(b2);    
		set.add(b3);    
		
		for(Books b:set){    
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
		}
	}

}
