import java.util.Scanner;

public class nameExercise19 {

	public static void main(String[] args) {
		String phrase;
		String[] words;

		phrase = getInput("Enter a phrase: ");
		words = phrase.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith("Pi") || words[i].startsWith("pi"))
				System.out.println(words[i]);
		}
	}
	

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print(prompt);
		s = input.nextLine();
		return s;
	}

}
