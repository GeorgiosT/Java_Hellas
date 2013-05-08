import java.util.Scanner;

public class Temperatures3 {

	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		double temp;
		int choice;
		double celcious, farenheit;
		double celTemp, farTemp;

		System.out.print("Enter a temp: ");
		temp = keyboard.nextDouble();

		System.out.print("Enter 1 to convert Celcious to Farenheit or 2 to convert Farenheit to Celcious:");
		choice = keyboard.nextInt();

		celcious = convertToCel(temp);
		
		farenheit = convertToFah(temp);
		

		if (choice == 1) {
			
			System.out.println(temp + " in celcious  is: " + celcious);
		} else {

			System.out.println(temp + " in fahrenheit  is: " + farenheit);
		}
	}

	private static double convertToCel(Double temp) {
		double c;
		c = ((temp - 32) / 1.8);
		return c;
	}

	private static double convertToFah(Double temp) {
		double f;
		f = (temp * 1.8 + 32);
		return f;
	}

}
