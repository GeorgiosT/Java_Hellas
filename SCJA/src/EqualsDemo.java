public class EqualsDemo {

	public static void main(String[] args) {
		float a = 8;

		byte b = 8;

		if (a == b)
			System.out.println("The same");
		else
			System.out.println("Different");

		String c = new String("Test");
		String d = new String("Test");

		if (c == d)
			System.out.println("The same");
		else
			System.out.println("Different");
	}

}
