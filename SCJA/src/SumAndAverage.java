import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		// using a for loop and input for the upperbound
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an upperbound: ");
		int upperbound = input.nextInt();

		int i;
		int total = 0;

		for (i = 0; i <= upperbound; i++) {
			total += i;
		}
		double average = (double) total / --i;

		System.out.println("The sum is " + total);
		System.out.println("The average is " + average);
		System.out.println();

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// using a while-do loop
		int i1 = 0;
		int total1 = 0;
		while (i1 <= upperbound) {

			total1 += i1++;

		}
		double average1 = (double) total1 / --i1;

		System.out.println("The sum is " + total1);
		System.out.println("The average is " + average1);
		System.out.println();

		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// using a do-while loop
		int i2 = 0;
		int total2 = 0;
		do {
			total2 += i2++;

		} while (i2 <= upperbound);

		double average2 = (double) total2 / --i2;

		System.out.println("The sum is " + total2);
		System.out.println("The average is " + average2);
		System.out.println();

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// adding the divisible by 2 numbers
		int i3;
		int total3 = 0;

		for (i3 = 0; i3 <= upperbound; i3++) {
			if (i3 % 2 == 0) {
				total3 += i3;
			}
		}
		double average3 = (double) total3 / --i3;

		System.out.println("The sum is " + total3);
		System.out.println("The average is " + average3);
		System.out.println();

		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// adding the divisible by 7 numbers
		int i4;
		int total4 = 0;

		for (i4 = 0; i4 <= upperbound; i4++) {
			if (i4 % 7 == 0) {
				total4 += i4;
			}
		}
		double average4 = (double) total4 / --i4;

		System.out.println("The sum is " + total4);
		System.out.println("The average is " + average4);
		System.out.println();

		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// sum the squares of the numbers(1*1,2*2,3*3....100*100)
		int total5 = 0;
		int i5;
		for (i5 = 0; i5 <= upperbound; i5++) {

			total5 += i5 * i5;

		}

		double average5 = (double) total5 / --i5;

		System.out.println("The sum is " + total5);
		System.out.println("The average is " + average5);
		System.out.println();

	}

}
