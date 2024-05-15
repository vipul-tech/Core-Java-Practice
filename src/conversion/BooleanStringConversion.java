package conversion;

public class BooleanStringConversion {

	public static void main(String[] args) {
		String s1 = "TrUe";
		String s2 = "false";
		String s3 = "ok";
		String s4 = "True";
		
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		boolean b4 = Boolean.parseBoolean(s4);
		
		System.out.println(b1 + " " + b2 +" " + b3 + " " + b4);
		
		Boolean bc1 = Boolean.valueOf(s1);
		Boolean bc2 = Boolean.valueOf(s2);
		Boolean bc3 = Boolean.valueOf(s3);
		Boolean bc4 = Boolean.valueOf(s4);
		
		System.out.println(bc1 + " " + bc2 +" " + bc3 + " " + bc4);
		
		boolean bl1 = true;
		boolean bl2 = false;
		
		String str1 = Boolean.toString(bl1);
		String str2 = Boolean.toString(bl2);
		
		String str3 = String.valueOf(bl1);
		String str4 = String.valueOf(bl2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
