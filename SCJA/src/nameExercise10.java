import java.util.Scanner;


public class nameExercise10 {


	public static void main(String[] args) {
		String phrase;
		int wordCount = 0;
		phrase = getInput("Enter a phrase: ");
		
		String[] words = phrase.split(" ");
		
		//Check each word
		for(int i = 0; i < words.length; i++){
			int letterCount = 0;
			for(int j = 0; j < words[i].length(); j++){
				if(Character.isLetter(words[i].charAt(j)))
					letterCount++;
			}
			if(letterCount == words[i].length())
				wordCount++;
			
		}
		System.out.println("Word count is: " + wordCount);
				
	}
	
	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print(prompt);
		s = input.nextLine();
		return s;
	} 

}
