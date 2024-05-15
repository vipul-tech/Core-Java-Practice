package collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(52);
		ad.add(95);
		ad.add(69);
		ad.add(33);
		ad.add(90);
		
		for(Integer i : ad)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("Initial queue : " + ad);
		
		ad.offer(44);
		System.out.println("After offer() : " + ad);
		ad.offerFirst(67);
		System.out.println("After offerFirst() : " + ad);
		ad.offerLast(89);
		System.out.println("After offerLast() : " + ad);
		
		ad.poll();
		System.out.println("After poll() : " + ad);
		
		ad.pollFirst();
		System.out.println("After pollFirst() : " + ad);
		
		ad.pollLast();
		System.out.println("After pollLast() : " + ad);
	}

}
