package conversion;

public class IntegerLongConversion {

	public static void main(String[] args) {
		int i = 100;
		long l = i;
		System.out.println(i);
		
		Long l1 = new Long(i);
		System.out.println(l1);
		
		Long l2 = Long.valueOf(i);
		System.out.println(l2);
		
		long l3 = 5621945l;
		int i3 = (int)l3;
		System.out.println(i3);
		
		int i4 = l1.intValue();
		System.out.println(i4);
	}

}
