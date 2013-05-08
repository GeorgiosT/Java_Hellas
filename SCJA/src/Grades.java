import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char grade = 'F';
		String input;

		System.out.print("Enter a grade: ");
		/*input = keyboard.nextLine();

		if(input.length() > 0)
			grade = input.charAt(0);
		*/
		grade = keyboard.findInLine(".").charAt(0);
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Well Done");
			break;
		case 'C':
		case 'c':
			System.out.println("Could do better");
			break;
		case 'D':
		case 'd':
			System.out.println("You Passed");
			break;
		default:
			System.out.println("Better Luck Next Time");
			break;
		}

	}

}
