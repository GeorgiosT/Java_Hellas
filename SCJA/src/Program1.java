import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter a Number: ");
		num = input.nextInt();

		if (num > 0)
			System.out.println("The number entered is greater than 0");
		else if (num == 0)
			System.out.println("The number entered is equal to zero");
		else
			System.out.println("The number is less than zero");
	}

}
