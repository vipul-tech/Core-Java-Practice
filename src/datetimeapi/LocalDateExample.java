package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Today's date : " + date);
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Yesterday's date : " + yesterday);
		System.out.println("Tomorrow's date : " + tomorrow);
		
		System.out.println("Is " + date.getYear() + " a leap year ? " + date.isLeapYear());
		System.out.println("Is " + date.plusYears(2).getYear() + " a leap year ? " + 			date.plusYears(2).isLeapYear());
		System.out.println("Is " + date.minusYears(4).getYear() + " a leap year ? " +   			date.minusYears(4).isLeapYear());
		
		LocalDate date2 = LocalDate.of(2014, 05, 23);
		System.out.println("Is " + date2.getYear() + " a leap year ? " + date2.isLeapYear());
		
		LocalDateTime datetime = date.atTime(15,30,47);      
		System.out.println(datetime);
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.plusMonths(3));
		System.out.println(date.minusMonths(3));
		System.out.println(date.plusWeeks(4));
		System.out.println(date.minusWeeks(4));
		
		String strDate = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println("String date : " + strDate);
		
		String strDate1 = "2023-05-23";
		System.out.println("Parsed date from string : " + LocalDate.parse(strDate1));
	}

}
