package collection;

import java.util.HashSet;
import java.util.Set;

class Book1 {
	int id;
	String name, author, publisher;
	int quantity;

	public Book1(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Book1> bookSet = new HashSet<>();

		Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
		Book1 b4=new Book1(103,"Operating System","Galvin","Wiley",6);
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		
		for(Book1 b : bookSet)
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
	}

}
