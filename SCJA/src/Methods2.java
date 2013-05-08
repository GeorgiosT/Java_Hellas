import java.util.Scanner;

public class Methods2 {

	public static void main(String[] args) {
		String s1, s2;
		double d1, d2;

		s1 = getInput("Enter a number: ");
		s2 = getInput("Enter a Number: ");

		d1 = Double.parseDouble(s1);
		d2 = Double.parseDouble(s2);
		double result = d1 + d2;

		System.out.println(result);
	}

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.println(prompt);
		s = input.nextLine();
		return s;
	}

}