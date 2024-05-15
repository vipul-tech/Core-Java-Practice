package conversion;

public class LongToStringExample {

	public static void main(String[] args) {
		Long l = 7865439l;
		String s1 = Long.toString(l);
		System.out.println(s1+2000);
		
		String s2 = String.valueOf(l);
		System.out.println(s2+3000);
	}

}
