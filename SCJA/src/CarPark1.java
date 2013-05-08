import java.util.Scanner;

public class CarPark1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float stay;
		float charge;

		System.out.println("Welcome to the Euro Carpark Pay System");
		System.out.println("How long will you park for?  ");
		stay = input.nextFloat();
		input.close();// closes the input!

		if (stay <= 2.0f)
			charge = 3.0f;
		else if (stay > 10.0f)
			charge = 7.0f;
		else
			charge = ((stay - 2.0f) * 0.5f) + 3.0f;

		System.out.printf("The total cost is:  €%.2f", charge);

	}

}
