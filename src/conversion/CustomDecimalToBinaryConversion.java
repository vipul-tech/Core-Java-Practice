package conversion;

import java.util.Stack;

public class CustomDecimalToBinaryConversion {

	public static String getBinary(int decimal) {
		Stack<Integer> stack = new Stack<>();
		String binary = "";
		if(decimal==0)
			stack.push(0);
		while(true) {
			if(decimal==0)
				break;
			else {
				int temp = decimal%2;
				stack.push(temp);
				decimal = decimal/2;
			}
		}
		
		while(!stack.isEmpty()) {
			binary = binary + stack.pop();
		}
		return binary;
	}

	public static void main(String[] args) {
		System.out.println("Binary of 10 : " + getBinary(10));
		System.out.println("Binary of 15 : " + getBinary(15));
		System.out.println("Binary of 1 : " + getBinary(1));
		System.out.println("Binary of 0 : " + getBinary(0));
		System.out.println("Binary of 21 : " + getBinary(21));
		System.out.println("Binary of 31 : " + getBinary(31));
	}

}
