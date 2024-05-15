package conversion;

public class StringToLongExample {

	public static void main(String[] args) {
		String s = "1234567890";
		long l = Long.parseLong(s);
		System.out.println(l+101);
	}

}
