import java.util.Scanner;

public class nameExercise17 {

	public static void main(String[] args) {
		String phrase;

		phrase = getInput("Enter a phrase: ");

		phrase = phrase.replace("E", "O").replace("e", "o");

		System.out.println(phrase);

	}

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print(prompt);
		s = input.nextLine();
		return s;
	}

}
