package datetimeapi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
		System.out.println(zone);
		System.out.println(zone.plusYears(2));
		System.out.println(zone.minusYears(3));
		
		ZonedDateTime zone2 = ZonedDateTime.now();
		System.out.println(zone2.getZone());
		System.out.println(zone2.minus(Period.ofDays(100)));
		System.out.println(zone2.plus(Period.ofDays(100)));
		
		LocalDateTime ldt = LocalDateTime.of(2024, Month.APRIL, 9, 15, 26);
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, india);
		System.out.println("In India Central Time Zone: " + zdt);
		ZoneId japan = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zdt2 = zdt.withZoneSameInstant(japan);
		System.out.println("In Tokyo Central Time Zone:" + zdt2);
	}

}
