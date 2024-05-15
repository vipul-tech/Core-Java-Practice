package datetimeapi;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class YearMonthExample {

	public static void main(String[] args) {
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		
		String s = ym.format(DateTimeFormatter.ofPattern("MMM-yyyy"));
		System.out.println(s);
		
		int y = ym.get(ChronoField.YEAR);
		System.out.println(y);
		
		int m = ym.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(m);
		
		YearMonth ym1 = ym.minus(Period.ofYears(3));
		System.out.println(ym1);
		
		YearMonth ym2 = ym.plus(Period.ofYears(3));
		System.out.println(ym2);
		
		System.out.println(ym.getMonth());

	}

}
