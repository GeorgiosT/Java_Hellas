import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter a number: ");
			num = input.nextInt();
			sum = sum += num;
		} while (num != 0);

		System.out.println("The numbers summary is: " + sum);
	}

}
