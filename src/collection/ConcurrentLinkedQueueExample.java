package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();
		clq.add(23);
		clq.add(90);
		clq.add(45);
		clq.add(55);
		clq.add(91);

		System.out.println(clq);

		//inserts the element at the tail of this queue  
		clq.offer(60);  
		System.out.println("Queue : "+clq);
		//Returns true if this queue contains the specified element  
		if(clq.contains(45)){  
			System.out.println("This queue conatins 45");  
		}  
		else{  
			System.out.println("45 is absent");  
		}  
		//returns true if the queue is empty  
		if(clq.isEmpty()){  
			System.out.println("Add some elements because the queue is empty.");  
		}  
		else{  
			System.out.println("Queue is not empty");  
		}

		ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();  
		List<Integer> list = new ArrayList<Integer>();  
		queue.add(11);  
		queue.add(100);  
		queue.add(122);  
		queue.add(102);  
		queue.add(112);
		list.add(11);  
		list.add(100);  
		System.out.println("Elements in queue : "+queue);  
		//remove() method will remove the specified element from the queue  
		queue.remove(122);  
		queue.remove(102);  
		System.out.println("Remaining elements in queue : "+queue);  
		//Removes all the elements of this in queue which are present in the list  
		queue.removeAll(list);  
		System.out.println("Elemts of the list will get removed : "+queue);  
		//Retain only those elements in this queue that are present in the list  
		queue.retainAll(list);  
		System.out.println("Queue will retain the elements of the list: "+queue); 
	}

}