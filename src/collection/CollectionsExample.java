package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(67);
		list.add(52);
		list.add(59);
		list.add(21);
		list.add(39);
		list.add(99);
		
		System.out.println("List : " + list);
		
		Collections.addAll(list, 84, 91, 46, 96);
		System.out.println("Updated List : " + list);
		
		System.out.println("Maximum value in the list : " + Collections.max(list));
		System.out.println("Maximum value in the list : " + Collections.min(list));
		Collections.sort(list);
		System.out.println("Sorted list : " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list in reverse order : " + list);
	}

}
