package collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Guava");
		fruits.add("Apple");
		
		System.out.println("Printing list : " + fruits);
		
		System.out.println("Traversing  list using forEach loop........");
		for(String fruit : fruits)
			System.out.print(fruit + " ");
		
		System.out.println();
		System.out.println("Traversing  list using for loop.......");
		for(int i=0;i<fruits.size();i++)
			System.out.print(fruits.get(i) + " ");
		
		fruits.set(2, "Papaya");
		System.out.println();
		System.out.println("Traversing  list using iterator.......");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
		System.out.println();
		Collections.sort(fruits);
		System.out.println("Sorted fruits list : " + fruits);
		
		System.out.println("Traversing  fruits list using forEach() method and passing method reference...");
		fruits.forEach(System.out::println);
		System.out.println("Traversing fruits list using forEach() method and passing lambda expression....");
		fruits.forEach(fruit->System.out.print(fruit + " "));
		
		System.out.println();
		System.out.println("Traversing list using listiterator....");
		ListIterator<String> litr = fruits.listIterator(fruits.size());
		while(litr.hasPrevious())
			System.out.print(litr.previous() + " ");
		
		System.out.println();
		System.out.println("Traversing list using forEachRemaining method.....");
		Iterator<String> itr2 = fruits.iterator();
		itr2.forEachRemaining(fr->System.out.print(fr+" "));
	}

}
