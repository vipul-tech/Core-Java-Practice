package conversion;

public class CharIntConversion {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '5';
		
		int i1 = c1;
		int i2 = c2;
		
		System.out.println(i1);
		System.out.println(i2);
		
		int a = Character.getNumericValue(c2);
		System.out.println(a);
		
		int b = Integer.parseInt(String.valueOf(c2));
		System.out.println(b);
		
		int a1 = 65;
		char ch1 = (char)a1;
		System.out.println(ch1);
		
		int a2 = 1;
		char ch2 = (char)(a2+'0');
		System.out.println(ch2);
		
		int a3 = '1';
		char ch3 = (char)a3;
		System.out.println(ch3);
		
		int REDIX1 = 10;
		int a4 = 2;
		char ch4 = Character.forDigit(a4, REDIX1);
		System.out.println(ch4);
		
		int REDIX2 = 16;
		int a5 = 11;
		char ch5 = Character.forDigit(a5, REDIX2);
		System.out.println(ch5);
	}

}
