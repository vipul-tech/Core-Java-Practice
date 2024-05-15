package datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
	    System.out.println(inst);  
	    
	    Instant i1 = Instant.now();
	    System.out.println(i1);
	    
	    Instant i2 = i1.minus(Duration.ofDays(10));
	    System.out.println(i2);
	    
	    Instant i3 = i1.plus(Duration.ofDays(10));
	    System.out.println(i3);
	    
	    System.out.println(i3.isSupported(ChronoUnit.DAYS));
	    System.out.println(inst.isSupported(ChronoUnit.YEARS));
	}

}
