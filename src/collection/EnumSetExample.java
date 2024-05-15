package collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {

	public static void main(String[] args) {
		Set<days> s = EnumSet.of(days.MONDAY, days.FRIDAY, days.SATURDAY);
		Iterator<days> itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println(set1);
		
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println(set2);
	}

}
