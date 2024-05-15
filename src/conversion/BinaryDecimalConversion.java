package conversion;

public class BinaryDecimalConversion {

	public static void main(String[] args) {
		String binary = "10110";
		int decimal = Integer.parseInt(binary, 2);
		System.out.println("Decimal : " + decimal);
		
		String binaryString = Integer.toBinaryString(decimal);
		System.out.println("Binary : " + binaryString);
	}

}
