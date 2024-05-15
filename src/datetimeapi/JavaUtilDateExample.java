package datetimeapi;

import java.util.Date;

public class JavaUtilDateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		System.out.println(date2);
		
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		System.out.println(date.getTime());
	}

}
