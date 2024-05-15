package conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStringConversion {

	public static void main(String[] args) throws ParseException {
		String date = "23/05/1996";
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d = df.parse(date);
		System.out.println(d);
		
		Date d1 = Calendar.getInstance().getTime();
		DateFormat df1 = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		String date1 = df1.format(d1);
		System.out.println("Converted String: " + date1);
	}

}
