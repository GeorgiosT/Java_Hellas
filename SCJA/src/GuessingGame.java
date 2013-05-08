import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int guess;
		boolean correctGuess = false;

		Scanner input = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100 + 1);

		do {
			System.out.println("Enter a number between 0 and 100");
			guess = input.nextInt();
			if (guess == randomNumber)
				correctGuess = true;
			else if (guess < randomNumber)
				System.out.println("Go Higher");
			else 
				System.out.println("Go lower");
		} while (correctGuess == false);

		System.out.println("Well done");
	}

}
