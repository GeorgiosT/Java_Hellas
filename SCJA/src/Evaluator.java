import java.util.Scanner;

public class Evaluator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input: ");
		String calc = input.nextLine();

		String[] ops = calc.split(" ");

		double result = 0.0;

		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("*"))//mult
				result = Double.parseDouble(ops[i - 1])
						* Double.parseDouble(ops[i + 1]);
			
			else if (ops[i].equals("/"))//div
				result = Double.parseDouble(ops[i - 1])
						/ Double.parseDouble(ops[i + 1]);
			
			else if (ops[i].equals("+"))//add
				result = Double.parseDouble(ops[i - 1])
						+ Double.parseDouble(ops[i + 1]);
			
			else if (ops[i].equals("-"))//sub
				result = Double.parseDouble(ops[i - 1])
						- Double.parseDouble(ops[i + 1]);
		}

		System.out.println(result);

	}
}