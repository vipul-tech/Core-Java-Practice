package datetimeapi;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		String[] strArray = TimeZone.getAvailableIDs();
		int count = 0;
		for(String str : strArray) {
			count++;
			System.out.println(count + " : " + str);
		}

		TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
		System.out.println("The Offset value of TimeZone: " +   
				zone.getOffset(Calendar.ZONE_OFFSET));  
		System.out.println("Value of ID is: " + zone.getID());  
		System.out.println("Display name for this time zone: "+ zone.getDisplayName());  
		
		TimeZone zone1 = TimeZone.getDefault();     
		System.out.println("The ID of the default TimeZone is: " + zone1.getID());
		
		// setting the time zone ID  
		zone1.setID("GMT + 07:01");  
		  
		// checking for the time zone ID  
		System.out.println("The Time zone ID is: " + zone1.getID());
	}

}
