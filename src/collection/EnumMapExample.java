package collection;

import java.util.EnumMap;
import java.util.Map;

enum weekDays {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<weekDays, Integer> map = new EnumMap<weekDays, Integer>(weekDays.class);
		map.put(weekDays.FRIDAY, 5);
		map.put(weekDays.SATURDAY, 6);
		map.put(weekDays.MONDAY, 1);
		map.put(weekDays.THURSDAY, 4);
		map.put(weekDays.WEDNESDAY, 3);
		map.put(weekDays.TUESDAY, 2);
		map.put(weekDays.SUNDAY, 7);
		
		for(Map.Entry<weekDays, Integer> m : map.entrySet())
			System.out.println(m.getKey() + " : " + m.getValue());
	}

}
