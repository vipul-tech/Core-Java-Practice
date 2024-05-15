package conversion;

public class IntegerDoubleConversion {

	public static void main(String[] args) {
		int i = 500;
		double d = i;
		System.out.println(d);
		
		Double dobj = new Double(i);
		System.out.println(dobj);
		
		Double dobj2 = Double.valueOf(i);
		System.out.println(dobj2);
		
		double d2 = 67.9;
		int i2 = (int)d2;
		System.out.println(i2);
		
		Double dobj3 = new Double(98.7);
		int i3 = dobj3.intValue();
		System.out.println(i3);
	}

}
