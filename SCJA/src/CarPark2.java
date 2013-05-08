import java.util.Scanner;

public class CarPark2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float stay;
		float amountDue;

		System.out.println("Welcome to the Euro Carpark Pay System");
		System.out.println("How long was your stay?  ");
		stay = input.nextFloat();
		input.close();// closes the input!

		if (stay > 10.0f)
			amountDue = 7.0f;
		else if (stay <= 2.0f)
			amountDue = 3.0f;
		else
			amountDue = 3.0f + (stay - 2.0f) * 0.50f;

		System.out.printf("Total Due:  €%.2f", amountDue);

	}
}
