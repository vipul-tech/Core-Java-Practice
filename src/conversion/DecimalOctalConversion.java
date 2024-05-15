package conversion;

public class DecimalOctalConversion {

	public static void main(String[] args) {
		String octal = "11";
		int decimal = Integer.parseInt(octal, 8);
		System.out.println("Decimal : " + decimal);
		
		String octalString = Integer.toOctalString(decimal);
		System.out.println("Octal : " + octalString);
	}

}
