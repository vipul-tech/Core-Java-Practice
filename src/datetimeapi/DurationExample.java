package datetimeapi;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));

		Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
		System.out.println(d1.isNegative());  
		
		Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		System.out.println(d2.isNegative());  
		
		System.out.println(d.getSeconds());  
	    Duration d3 = d.minus(d);  
	    System.out.println(d3.getSeconds());  
	    
	    Duration d4 = d.plus(d);  
	    System.out.println(d4.getSeconds());  
	}

}
