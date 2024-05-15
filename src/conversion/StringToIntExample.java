package conversion;

public class StringToIntExample {

	public static void main(String[] args) {
		String s = "400";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(s+100);
		System.out.println(i+100);
		
		String s2 = "300";
		Integer i2 = Integer.valueOf(s2);
		System.out.println(s2+100);
		System.out.println(i2+100);
		
		String s3 = "hello";
		Integer i3 = Integer.valueOf(s3);
		System.out.println(i3);
	}

}
