package conversion;

public class DecimalHexadecimalConversion {

	public static void main(String[] args) {
		String hexadecimal = "F";
		int decimal = Integer.parseInt(hexadecimal, 16);
		System.out.println("Decimal : " + decimal);
		
		String hexaString = Integer.toHexString(decimal);
		System.out.println("Hexadecimal : " + hexaString);
	}

}
