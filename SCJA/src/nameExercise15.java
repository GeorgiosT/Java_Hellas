import java.util.Scanner;


public class nameExercise15 {

	public static void main(String[] args) {
		String word1;
		String word2;
		String newString1 ="";
		
		word1 = getInput("Enter first word: ");
		word2 = getInput("Enter second word: ");
		
		
		
			if(word1.compareTo(word2) < 0)
				System.out.println(word1 + " " + word2);
			else if(word1.compareTo(word2) > 0)
				System.out.println(word2 + " " + word1);
			else
				System.out.println(word1 + " " + word2);
				
			}
				
			
			private static String getInput(String prompt) {
			Scanner input = new Scanner(System.in);
			String s;
			System.out.print(prompt);
			s = input.nextLine();
			return s;
	}

}
