package datetimeapi;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current date is " + calendar.getTime());

		calendar.add(Calendar.DATE, -10);
		System.out.println("10 days ago: " + calendar.getTime());

		calendar.add(Calendar.MONTH, 5);
		System.out.println("5 months later: " + calendar.getTime());

		calendar.add(Calendar.YEAR, 3);
		System.out.println("3 years later: " + calendar.getTime());  

		Calendar calendar2 = Calendar.getInstance();
		System.out.println("At present Calendar's Year : " + calendar2.get(Calendar.YEAR));
		System.out.println("At present Calendar's Month : " + calendar2.get(Calendar.MONTH));
		System.out.println("At present Calendar's Day : " + calendar2.get(Calendar.DATE));
		
		int maximum = calendar2.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in week : " + maximum);
		maximum = calendar2.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in year : " + maximum);
		
		int minimum = calendar2.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days in week: " + minimum); 
		minimum = calendar2.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in year: " + minimum);
	}

}
