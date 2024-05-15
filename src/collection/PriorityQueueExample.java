package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Mexico");
		pq.add("Canada");
		pq.add("Japan");
		pq.add("Germany");
		pq.add("France");
		
		System.out.println(pq);
		
		System.out.println("Head : " + pq.element());
		System.out.println("Head : " + pq.peek());
		
		System.out.println("iterating the queue elements:"); 
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		System.out.println();
		pq.remove();
		pq.poll();
		System.out.println(pq);
	}

}
