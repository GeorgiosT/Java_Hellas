import java.util.Scanner;

public class nameExercise16 {

	public static void main(String[] args) {
		String phrase;	
		String[] words;
		

		
		phrase =getInput("Enter phrase: ");
		words = phrase.split(" ");
		
		
		for(int i =0;i<words.length;i++){
			for(int j = 0; j < words [i].length(); j++){
				if(words[i].charAt(j) == 'E'  || words[i].charAt(j) == 'e'){
			System.out.println(words[i] + "1st e/E at " + j);
			break;
				}
			}
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
