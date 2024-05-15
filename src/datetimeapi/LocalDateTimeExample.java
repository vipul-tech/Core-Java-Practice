package datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Current date & time : " + date);
		
		System.out.println("Before formating : " + date);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formatedDate = date.format(format);
		System.out.println("After formating : " + formatedDate);
		
		LocalDateTime date2 = LocalDateTime.of(2021, 06, 29, 20, 15, 45);
		System.out.println(date2);
		System.out.println(date2.get(ChronoField.DAY_OF_WEEK));
		System.out.println(date2.get(ChronoField.DAY_OF_YEAR));
		System.out.println(date2.get(ChronoField.DAY_OF_MONTH));
		System.out.println(date2.get(ChronoField.HOUR_OF_DAY));
		System.out.println(date2.get(ChronoField.MINUTE_OF_DAY));
		
		LocalDateTime time = date.minusDays(100);
		System.out.println(time);
		
		LocalDateTime time1 = date.plusDays(100);
		System.out.println(time1);
	}

}
