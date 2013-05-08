import java.util.Scanner;

public class nameExercise11{

	public static void main(String[] args) {
		String phrase;
		do {
			int wordCount = 0;
			
			phrase = getInput("Enter a phrase: ");

			// Clear Screen
			for (int i = 0; i < 50; i++)
				System.out.println();
			
			
			String[] words = phrase.split(" ");

			// Check each word
			for (int i = 0; i < words.length; i++) {
				int letterCount = 0;
				// Check each letter in each word
				// If the number of letters equal the length
				// of the word then the word is made up of all
				// letters.
				for (int j = 0; j < words[i].length(); j++) {
					if (Character.isLetter(words[i].charAt(j)))
						letterCount++;
				}
				if (letterCount == words[i].length())
					wordCount++;
			}
			System.out.println("Word count is: " + wordCount);
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
