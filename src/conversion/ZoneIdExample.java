package conversion;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdExample {

	public static void main(String[] args) {
		ZoneId id1 = ZoneId.of("Asia/Kolkata");
		ZoneId id2 = ZoneId.of("Asia/Tokyo");
		
		LocalTime t1 = LocalTime.now(id1);
		LocalTime t2 = LocalTime.now(id2);
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.isBefore(t2));
		
		ZoneId zone = ZoneId.systemDefault();     
	    System.out.println(zone);  
	    String s = zone.getId();
	    System.out.println(s);
	    System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT)); 
	}

}
