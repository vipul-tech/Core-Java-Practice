package datetimeapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time  : " + time);
		
		LocalTime time1 = LocalTime.of(14, 45, 55);
		System.out.println(time1);
		
		LocalTime t1 = time.minusHours(2);
		LocalTime t2 = time.plusHours(4);
		
		System.out.println(t1);
		System.out.println(t2);
		
		LocalTime t3 = time1.minusMinutes(24);
		LocalTime t4 = time1.plusMinutes(25);
		
		System.out.println(t3);
		System.out.println(t4);
		
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		
		LocalTime timeIndia = LocalTime.now(zone1);
		LocalTime timeJapan = LocalTime.now(zone2);
		
		System.out.println("India time now : " + timeIndia);
		System.out.println("Japan time now : " + timeJapan);
		
		long hours = ChronoUnit.HOURS.between(timeIndia, timeJapan);
		System.out.println("Hours between two Time Zone: " + hours);
		long minutes = ChronoUnit.MINUTES.between(timeIndia, timeJapan);
		System.out.println("Minutes between two Time Zone: " + minutes);
	}

}
