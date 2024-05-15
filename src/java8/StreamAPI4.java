package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI4 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(11,22,33);
		List<Integer> l2 = Arrays.asList(44,55);
		List<Integer> l3 = Arrays.asList(66,77,88,99);
		
		List<List<Integer>> list = Arrays.asList(l1, l2, l3);
		System.out.println(list);
		
		list.stream().forEach(System.out::println);
		
		List<Integer> result = list.stream().flatMap(lst->lst.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> result1 = list.stream().flatMap(lst->lst.stream()).map(x->x+x).collect(Collectors.toList());
		System.out.println(result1);
		
		List<Integer> result2 = list.stream().flatMap(lst->lst.stream()).filter(x->x>50).collect(Collectors.toList());
		System.out.println(result2);
		
		Optional<Integer> result3 = list.stream().flatMap(lst->lst.stream()).reduce((x,y)->x+y);
		System.out.println("Sum : "+result3.get());
		
		Optional<Integer> result4 = list.stream().flatMap(lst->lst.stream()).map(x->x+x).filter(x->x>100).reduce((x,y)->x+y);
		System.out.println("Sum : "+result4.get());
	}

}
