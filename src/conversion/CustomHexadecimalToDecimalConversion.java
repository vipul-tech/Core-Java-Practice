package conversion;

public class CustomHexadecimalToDecimalConversion {

	public static int getInteger(char c) {
		int temp;
		if(c == 'a' || c== 'A') {
			temp = 10;
		}else if(c == 'b' || c== 'B') {
			temp = 11;
		}else if(c == 'c' || c== 'C') {
			temp = 12;
		}else if(c == 'd' || c== 'D') {
			temp = 13;
		}else if(c == 'e' || c== 'E') {
			temp = 14;
		}else if(c == 'f' || c== 'F') {
			temp = 15;
		}
		else {
			temp = Integer.parseInt(String.valueOf(c));
		}
		return temp;
	}

	public static int getDecimal(String hexadecimalString) {
		
		int decimal = 0;
		int n = 0;
		for(int i=hexadecimalString.length()-1;i>=0;i--) {
			int temp = getInteger(hexadecimalString.charAt(i));
			decimal += temp*(Math.pow(16, n));
			n++;

		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println("Decimal of a is: "+getDecimal("a"));  
		System.out.println("Decimal of f is: "+getDecimal("f"));  
		System.out.println("Decimal of 121 is: "+getDecimal("121"));  
	}

}
