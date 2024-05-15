package conversion;

import java.util.Stack;

public class CustomDecimalToHexadecimalConversion {

	public static String getHexadecimal(int decimal) {
		Stack<Character> stack = new Stack<>();
		String hexadecimal = "";
		String str = "0123456789ABCDEF";
		if(decimal==0)
			stack.push('0');
		while(true) {
			if(decimal==0)
				break;
			else {
				int temp = decimal%16;
				stack.push(str.charAt(temp));
				decimal = decimal/16;
			}
		}
		
		while(!stack.isEmpty()) {
			hexadecimal = hexadecimal + stack.pop();
		}
		return hexadecimal;
	}
	
	public static void main(String[] args) {
		System.out.println("Hexadecimal of 10 : " + getHexadecimal(10));  
	     System.out.println("Hexadecimal of 15 : " + getHexadecimal(15));  
	     System.out.println("Hexadecimal of 289 : " + getHexadecimal(289));  
	     System.out.println("Hexadecimal of 1 : " + getHexadecimal(1));  
	     System.out.println("Hexadecimal of 0 : " + getHexadecimal(0));  
	     System.out.println("Hexadecimal of 28 is: " + getHexadecimal(28));  
	}

}
