package collection;

import java.util.LinkedList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListExample2 {

	public static void main(String[] args) {
		List<Book> bookList = new LinkedList<>();

		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		for(Book book : bookList)
			System.out.println(book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
	}

}
