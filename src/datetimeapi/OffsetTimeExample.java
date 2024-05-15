package datetimeapi;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeExample {

	public static void main(String[] args) {
		OffsetTime offset = OffsetTime.now();
		System.out.println(offset);
		
		int h = offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		
		int m = offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		
		int s = offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
		
		int hour = offset.getHour();
		int min = offset.getMinute();
		int sec = offset.getSecond();
		
		System.out.println("Hours : " + hour);
		System.out.println("Minutes : " + min);
		System.out.println("Seconds : " + sec);
	}

}
