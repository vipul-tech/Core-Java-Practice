package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);
		System.out.println("The stack size is: "+stk.size());
		System.out.println("Capacity of stack : " + stk.capacity());
		
		stk.push(29);
		stk.push(84);
		stk.push(41);
		stk.push(55);
		stk.push(21);
		
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);
		System.out.println("The stack size is: "+stk.size());
		System.out.println("Capacity of stack : " + stk.capacity());
		
		System.out.println("Top element : " + stk.peek());
		int removeTopElement = stk.pop();
		System.out.println("Removed element : " + removeTopElement);
		System.out.println("The stack size is: "+stk.size());
		System.out.println(stk);
		
		System.out.println("41 is present in stack at index : " + stk.search(41));
		
		System.out.println("Traversing stack using iterator");
		Iterator<Integer> itr = stk.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Iteration over the stack using forEach() Method & lambda expression:");
		stk.forEach(n->System.out.println(n));
		
		System.out.println("Iteration over the stack using forEach() Method & method reference:");
		stk.forEach(System.out::println);
		
		System.out.println("Iteration over the Stack from top to bottom:");
		ListIterator<Integer> litr = stk.listIterator(stk.size());
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	
	}

}
