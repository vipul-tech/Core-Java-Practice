package datetimeapi;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class ZoneOffsetExample {

	public static void main(String[] args) {
		ZoneOffset offset = ZoneOffset.UTC;
		System.out.println(offset);

		ZoneOffset offset2 = ZoneOffset.UTC;
		Temporal temporal = offset2.adjustInto(ZonedDateTime.now());
		System.out.println(temporal);

		ZoneOffset zone = ZoneOffset.ofHours(5);  
		System.out.println(zone); 

		ZoneOffset zone2 = ZoneOffset.ofHoursMinutes(5,30);  
		System.out.println(zone2);  

		ZoneOffset zone3 = ZoneOffset.UTC;  
		boolean b1 = zone3.isSupported(ChronoField.OFFSET_SECONDS);  
		System.out.println(b1);  
		
		boolean b2 = zone3.isSupported(ChronoField.SECOND_OF_DAY);  
		System.out.println(b2);  
	}

}
