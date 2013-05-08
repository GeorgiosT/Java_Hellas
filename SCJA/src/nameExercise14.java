import java.util.Scanner;

public class nameExercise14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String phrase;
		String stringToTest = "";
		int midChar;
		boolean itsPalindrome = true;

		phrase = getInput("Enter a phrase: ");

		// strip out spaces and symbols
		for (int i = 0; i < phrase.length(); i++) {
			if (Character.isLetter(phrase.charAt(i)))
				stringToTest = stringToTest + phrase.charAt(i);
		}
		stringToTest = stringToTest.toUpperCase();

		// find the middle of the string
		midChar = stringToTest.length() / 2;

		for (int i = 0; i < midChar; i++) {
			if (stringToTest.charAt(i) != stringToTest.charAt(stringToTest
					.length() - 1 - i))
				itsPalindrome = false;
		}

		if (itsPalindrome == true)
			System.out.println("This Phrase is a Palindrome");
		else
			System.out.println("This Phrase is not a Palindrome");

	}

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print(prompt);
		s = input.nextLine();
		return s;
	}
}
