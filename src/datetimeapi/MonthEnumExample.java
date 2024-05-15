package datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class MonthEnumExample {

	public static void main(String[] args) {
		Month m = Month.from(LocalDate.now());
		System.out.println(m);
		System.out.println(m.getValue());
		System.out.println(m.name());
		System.out.println(m.minus(2));
		System.out.println(m.plus(3));
		System.out.println("Total number of days in " + m + " month : " + m.minus(3).length(true));
	}

}
