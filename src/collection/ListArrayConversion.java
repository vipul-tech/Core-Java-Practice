package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayConversion {

	public static void main(String[] args) {
		String[] arr = {"France", "Thailand", "India", "Mexico", "Brazil", "Egypt", "New Zealand"};
		System.out.println("Printing array : " + Arrays.toString(arr));
		
		List<String> list = new ArrayList<>();
		for(String str : arr)
			list.add(str);
		
		System.out.println("Printing list : " + list);
		Collections.sort(list);
		System.out.println("Sorted list : " + list);
		
		String[] arr2 = list.toArray(new String[list.size()]);
		System.out.println("Printing array : " + Arrays.toString(arr2));
	}

}
