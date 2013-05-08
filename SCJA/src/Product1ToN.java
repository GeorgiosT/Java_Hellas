public class Product1ToN {

	public static void main(String[] args) {
		int product = 1;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			product *= i;

		}
		System.out.println("The product of 1 to  " + n + " is " + product);

	}

}
