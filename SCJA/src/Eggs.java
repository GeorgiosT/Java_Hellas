import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		int Total = 0;
		int Gross = 0;
		int dozen = 0;
		

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter eggs total: ");
		Total = input.nextInt();

		Gross = Total / 144; //Gross		
		Total = Total % 144; //Get remainder after the division
		dozen = Total / 12; //Calculate dozen

		System.out.println("The Gross number is:  " + Gross + "\n"
				+ "The dozen number is: " + dozen + "\n" + "Left over: "
				+ Total % 12);

	}

}
