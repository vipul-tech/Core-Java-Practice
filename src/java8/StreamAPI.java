package java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		System.out.println(list);
		
		Predicate<Integer> p = x->x%2==0;
		List<Integer> list2 = list.stream().filter(p.negate()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3 = list.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(list3);
		
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		IntStream is = IntStream.range(1,11);
		is.forEach(System.out::println);
		
		IntStream is2 = IntStream.rangeClosed(1, 11);
		is2.skip(2).limit(5).forEach(System.out::println);
		
		List<Integer> list4 = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		list4.stream().limit(5).skip(2).forEach(System.out::println);
		
		
	}

}
