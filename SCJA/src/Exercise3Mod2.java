import java.util.Scanner;

public class Exercise3Mod2 {

	public static void main(String[] args) {
		int numOfNumbers;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int total = 0;
		int repeatLarg = 1;
		int repeatSmall = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers? ");
		numOfNumbers = input.nextInt();

		for (int i = 0; i < numOfNumbers; i++) {
			System.out.println("Please insert a number: ");
			int num = input.nextInt();

			total = total += num;
			if (num > largest) {
				largest = num;
			}
			if (num < smallest) {
				smallest = num;
				repeatLarg=1;
			} else if (num == largest) {
				repeatLarg++;
				repeatSmall=1;
			} else if (num == smallest) {
				repeatSmall++;
			}
			System.out
					.println("The current largest num entered is: " + largest);
			System.out.println("The current smallest num entered is: "
					+ smallest);
			System.out.println("The current average is: " + (total / (i + 1)));
			System.out.println("\n");

			System.out.println("The Largest number has been entered "
					+ repeatLarg + " times");
			System.out.println("The Smallest number has been entered "
					+ repeatSmall + " times");

		}
	}

}
