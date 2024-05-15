package datetimeapi;

import java.time.LocalDate;
import java.time.Year;

public class YearExample {

	public static void main(String[] args) {
		Year y = Year.now();
		System.out.println("Current year : " + y);
		System.out.println("Current year is leap year? " + y.isLeap());
		System.out.println("Number of days in current year : " + y.length());
		
		Year y2 = Year.of(2021);
		System.out.println(y2 + " is leap year? " + y2.isLeap());
		System.out.println("Number of days in " + y2 + " year : " + y2.length());
		
		int n = 100;
		LocalDate ld = y2.atDay(n);
		System.out.println(n + "th day in year " + y2 + " : " + ld);
	}

}
