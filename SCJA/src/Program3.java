import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);

		System.out.println("Please insert a number");
		num = input.nextInt();

		if((num % 2) == 0) {
			System.out.println("The number is odd");
		} else {
			System.out.println("The number is even");
		}
	}
}
