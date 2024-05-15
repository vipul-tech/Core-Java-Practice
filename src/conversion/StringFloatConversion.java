package conversion;

public class StringFloatConversion {

	public static void main(String[] args) {
		String s = "23.8";
		float f = Float.parseFloat(s);
		System.out.println(f+2.1);
		
		String s1 = Float.toString(f);
		String s2 = String.valueOf(f);
		
		System.out.println(s1 + " " +s2);
		System.out.println(s1+10);
		System.out.println(s2+20);
	}

}
