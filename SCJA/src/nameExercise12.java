import java.util.Scanner;

public class nameExercise12 {

	public static void main(String[] args) {
		String phrase;
		do {

			phrase = getInput("\nEnter a phrase: ");

			// Clear Screen
			for (int i = 0; i < 50; i++)
				System.out.println();

			String[] words = phrase.split(" ");

			// Check each word
			for (int i =  words.length - 1; i >=0;i--) {
				System.out.print(words[i] + " ");
			}
		} while (!phrase.equals("End"));
	}

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print(prompt);
		s = input.nextLine();
		return s;
	}

}
