package conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimestampConversion {

	public static void main(String[] args) {
		Date date = new Date();
		long l = date.getTime();
		Timestamp ts = new Timestamp(l);
		System.out.println(ts);
		
		SimpleDateFormat formatter = new SimpleDateFormat();
		System.out.println(formatter.format(ts));
		
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		long l1 = ts1.getTime();
		Date date1 = new Date(l1);
		System.out.println(date1);
		
		Date date2 = ts1;
		System.out.println(date2);
	}

}
