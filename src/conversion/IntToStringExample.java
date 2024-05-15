package conversion;

public class IntToStringExample {

	public static void main(String[] args) {
		int i = 300;
		String s1 = String.valueOf(i);
		System.out.println(i+100);
		System.out.println(s1+100);
		
		String s2 = Integer.toString(i);
		System.out.println(s2+100);
		
		String s3 = String.format("%d", i);
		System.out.println(s3+100);
	}

}
