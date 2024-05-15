package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StreamAPI3 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(11, "Vipul");
		map.put(22, "Rohit");
		map.put(33, "Ananya");
		map.put(44, "Riya");
		map.put(55, "Tanu");
		
		Set<Entry<Integer, String>> s = map.entrySet();
		Iterator<?> it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<?,?> me = (Map.Entry<?,?>)it.next();
			System.out.println(me);
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
		System.out.println("---------");
		map.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
		System.out.println("---------");
		map.entrySet().stream().filter(m->m.getKey()>30).map(Map.Entry::getKey).forEach(System.out::println);
	}

}
