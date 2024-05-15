package datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DayOfWeekExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeek.getValue());
		System.out.println(dayOfWeek.name());
		System.out.println(dayOfWeek.ordinal());
		System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
		System.out.println("-----------");
		dayOfWeek = dayOfWeek.plus(3);
		System.out.println(dayOfWeek);
		dayOfWeek = dayOfWeek.minus(5);
		System.out.println(dayOfWeek);
	}

}
