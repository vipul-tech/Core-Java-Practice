package datetimeapi;

import java.time.OffsetDateTime;

public class OffsetDateTimeExample {

	public static void main(String[] args) {
		OffsetDateTime offset = OffsetDateTime.now();
		System.out.println(offset);
		System.out.println(offset.toLocalDate());
		System.out.println(offset.toLocalDateTime());
		System.out.println(offset.toLocalTime());
		
		OffsetDateTime value1 = offset.minusDays(100);
		System.out.println(value1);
		
		OffsetDateTime value2 = offset.plusDays(100);
		System.out.println(value2);
		
		System.out.println(offset.getDayOfMonth());
		System.out.println(offset.getDayOfYear());
		System.out.println(offset.getDayOfWeek());
	}

}
