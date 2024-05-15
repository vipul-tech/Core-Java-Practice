package conversion;

import java.util.Stack;

public class CustomDecimalToOctalConversion {

	public static String getOctal(int decimal) {
		Stack<Integer> stack = new Stack<>();
		String octal = "";
		if(decimal==0)
			stack.push(0);
		while(true) {
			if(decimal==0)
				break;
			else {
				int temp = decimal%8;
				stack.push(temp);
				decimal = decimal/8;
			}
		}
		
		while(!stack.isEmpty()) {
			octal = octal + stack.pop();
		}
		return octal;
	}
	
	public static void main(String[] args) {
		System.out.println("Octal of 1 : " + getOctal(1));
		System.out.println("Octal of 0 : " + getOctal(0));
		System.out.println("Octal of 8 : " + getOctal(8));  
		System.out.println("Octal of 19 : " + getOctal(19));  
		System.out.println("Octal of 81 : " + getOctal(81));  
	}

}
