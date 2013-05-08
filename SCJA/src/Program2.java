import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int inp = 0;
		int GradesNumber;
		int Grade;
		int GradesTotal = 0;
		int average;
		Scanner input = new Scanner(System.in);

		System.out.println("How many Grades do you want to enter?");
		GradesNumber = input.nextInt();

		do {
			System.out.println("Enter grade: ");
			Grade = input.nextInt();
			GradesTotal += Grade;
			inp++;
		} while (inp < GradesNumber);

		average = GradesTotal / GradesNumber;

		if (average >=70) {
			System.out.println("Distinction");
		} else if (average >=63) {
			System.out.println("Merit1");
		} else if (average >= 55) {
			System.out.println("Merit2");
		} else if (average >=40) {
			System.out.println("Pass");
		}

		else
			System.out.println("Fail");
	}
}
