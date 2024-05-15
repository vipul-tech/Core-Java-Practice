package conversion;

public class StringDoubleConversion {

	public static void main(String[] args) {
		String s = "1234763.789";
		double d = Double.parseDouble(s);
		System.out.println(d+45);
		
		String s1 = Double.toString(d);
		String s2 = String.valueOf(d);
		
		System.out.println(s1 + " " + s2);
		System.out.println(s1+100);
		System.out.println(s2+200);
	}

}
