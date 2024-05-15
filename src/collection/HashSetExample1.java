package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(56);
		set.add(78);
		set.add(90);
		set.add(56);
		set.add(49);
		
		System.out.println(set);
		
		set.remove(56);
		System.out.println(set);
		Object set1 = new HashSet<>();
		set1 = set.clone();
		System.out.println("Set 1 : " + set1);
		List<Integer> l = new ArrayList<>();
		l.add(42);
		l.add(71);
		l.add(42);
		set.addAll(l);
		System.out.println(set);
		set.removeAll(l);
		System.out.println(set);
		set.removeIf(n->n%2==1);
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

}
