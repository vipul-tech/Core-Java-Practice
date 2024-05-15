package datetimeapi;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample {

	public static void main(String[] args) {
		MonthDay month = MonthDay.now();
		System.out.println(month);
		LocalDate date = month.atYear(2021);
		System.out.println(date);
		boolean isValid = month.isValidYear(2009);
		System.out.println(isValid);
		long n = month.getLong(ChronoField.MONTH_OF_YEAR);
		System.out.println(n);
		
		ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(r1);  
	    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
	    System.out.println(r2); 
	}

}
