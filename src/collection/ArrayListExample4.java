package collection;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Is list empty : " + al.isEmpty());
		System.out.println("Size of list : " + al.size());
	
		System.out.println("Initial list of elements : " + al);
		al.add(12);
		al.add(94);
		al.add(63);
		al.add(29);
		System.out.println("After invoking add(E e) method : " + al);
		System.out.println("Size of list : " + al.size());
		al.add(2, 78);
		System.out.println("After invoking add(int index, E element) method : "+al);
		
		System.out.println("Is list empty : " + al.isEmpty());
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(101);
		al2.add(123);
		al2.add(390);
		
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method : " + al);
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(1098);
		al3.add(9867);
		al.addAll(3, al3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
        
        System.out.println("An initial list of elements before removal : "+al);
        al.remove((Integer)12);
        System.out.println("After invoking remove(object) method : " + al);
        al.remove(1);
        System.out.println("After invoking remove(index) method : " + al);
        al.removeAll(al3);
        System.out.println("After invoking removeAll() method : " + al);
        
        al.removeIf(n->n%2==0);
        System.out.println("After invoking removeIf() method: " + al);
        
        al.clear();
        System.out.println("After invoking clear() method : " + al);
        System.out.println("Is list empty : " + al.isEmpty());
        System.out.println("Size of list : " + al.size());
        
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Size of list l1 " + l1.size());
        
        ArrayList<Integer> l2 = new ArrayList<>(10);
        System.out.println("Size of list l2 " + l2.size());
	}

}
