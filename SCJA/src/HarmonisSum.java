public class HarmonisSum {

	public static void main(String[] args) {

		int n = 50000;
		float sum = 0.0f;

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Harmonic Sum form left to right is: " + sum);

		float sum2 = 0.0f;

		for (int i = 50000; i > 0; i--) {
			sum2 += 1.0f / i;
		}
		System.out.println("Harmonic Sum form right to left is: " + sum2);

	}
}