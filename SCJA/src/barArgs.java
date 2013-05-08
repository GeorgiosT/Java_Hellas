public class barArgs {

	public static void main(String[] args) {
		System.out.println(average(2, 4, 6, 7, 8, 9, 2, 6));

	}

	public static int average(int... numbers) {
		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		return total / numbers.length;
	}
}
 