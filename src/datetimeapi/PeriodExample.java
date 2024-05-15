package datetimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample {

	public static void main(String[] args) {
		Period p = Period.ofDays(21);
		Temporal t = p.addTo(LocalDate.now());
		System.out.println(t);
		
		Period p1 = Period.of(2024, 05, 23);
		System.out.println(p1.toString());
		
		Period p2 = Period.ofMonths(4);
		Period p3 = p2.minus(Period.ofMonths(3));
		System.out.println(p3);
		
		Period p4 = Period.ofMonths(4);
		Period p5 = p4.plus(Period.ofMonths(4));
		System.out.println(p5);
	}

}
