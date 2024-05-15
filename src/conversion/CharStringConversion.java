package conversion;

public class CharStringConversion {

	public static void main(String[] args) {
		String s = "Hello World!";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println("Character at " + i + " index : " + c);
		}
		
		char[] carr = s.toCharArray();
		for(char c : carr)
			System.out.print(c + "  ");
		
		System.out.println();
		char c = 'M';
		String s1 = Character.toString(c);
		System.out.println(s1);
		
		String s2 = String.valueOf(c);
		System.out.println(s2);
		
		String s3 = String.valueOf(carr);
		System.out.println(s3);
	}

}
