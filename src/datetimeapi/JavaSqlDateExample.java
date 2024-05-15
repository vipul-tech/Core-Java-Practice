package datetimeapi;

import java.sql.Date;
import java.time.LocalDate;

public class JavaSqlDateExample {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println("Before set : " + date);
		
		LocalDate ld = LocalDate.of(2021, 06, 29);
		Date date1 = Date.valueOf(ld);
		System.out.println(date1);
		
		String str = "2024-05-23";
		Date date2 = Date.valueOf(str);
		System.out.println(date2);
		
		date.setTime(1000000);
		System.out.println("Date after set : " + date);
		
		// This should not be used because sql does not have time component, so throws exception
//		Instant inst = date1.toInstant();
//		System.out.println(inst);
		
		LocalDate ld1 = date2.toLocalDate();
		System.out.println(ld1);
		
		String str1 = date1.toString();
		System.out.println(str1);
	}

}
