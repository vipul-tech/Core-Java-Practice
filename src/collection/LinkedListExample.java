package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		System.out.println("Initial list of elements : "+ll);

		ll.add("Mumbai");
		ll.add("Kolkata");
		ll.add("New Delhi");
		ll.add("Chennai");
		ll.add("Bengaluru");
		System.out.println("After invoking add(E e) method: "+ll);

		ll.add(2, "Hyderabad");
		System.out.println("After invoking add(int index, E element) method: "+ll);

		List<String> l = new LinkedList<>();
		l.add("Chandigarh");
		l.add("Ahmedabad");
		ll.addAll(l);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  

		Collection<String> l2 = new LinkedList<>();
		l2.add("Mysuru");
		l2.add("Patna");
		l2.add("Pune");
		ll.addAll(2, l2);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  

		ll.addFirst("Lukhnow");
		System.out.println("After invoking addFirst(E e) method: "+ll);

		ll.addLast("Jaipur");
		System.out.println("After invoking addLast(E e) method: "+ll);

		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();
		System.out.println("Reversed list");
		Iterator<String> ditr = ll.descendingIterator();
		while(ditr.hasNext())
			System.out.print(ditr.next() + " ");

		System.out.println();
		ll.remove();
		System.out.println("After invoking remove() method: "+ll);

		ll.remove(2);
		System.out.println("After invoking remove(index) method: "+ll); 

		ll.remove("Pune");
		System.out.println("After invoking remove(object) method: "+ll); 
		
		ll.removeAll(l);
        System.out.println("After invoking removeAll() method: "+ll);
        
        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll);
        
        ll.removeLast();
        System.out.println("After invoking removeLast() method: "+ll);
        
        ll.removeIf(str->str.contains("Chennai"));
        System.out.println("After invoking removeIf() method: "+ll);
        
        ll.add(3, "Kolkata");
        ll.add(1, "New Delhi");
        System.out.println("Updated list : " + ll);
        
        ll.removeFirstOccurrence("New Delhi");
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);  

        ll.removeLastOccurrence("Kolkata");
        System.out.println("After invoking removeLastOccurrence() method: "+ll);  

        ll.clear();
        System.out.println("After invoking clear() method: "+ll);   


	}

}
