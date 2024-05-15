package inputoutput;

import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamClassExample {

	public static void main(String[] args) {
		ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
		System.out.println(osc.getName());
		System.out.println(osc.getSerialVersionUID());
		System.out.println(osc.getField("hash"));
		System.out.println(ObjectStreamClass.NO_FIELDS);
		System.out.println(osc.toString());
		System.out.println(osc.forClass());
		System.out.println(osc.getClass());
		System.out.println(osc.getFields());
		
		System.out.println("------------------");
		System.out.println(""+osc.getField("value"));
		ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);
        System.out.println("" + osc2.getField("isTimeSet"));  
	}

}
