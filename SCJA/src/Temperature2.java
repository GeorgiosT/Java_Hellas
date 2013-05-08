import java.util.Scanner;

public class Temperature2 {

	public static void main(String[] args) {
		/*System.out.println("Cel\t\t->\t\t Fah");
		System.out.println("=====================================");
		
		for(int celTemp = -50; celTemp <= 100; celTemp += 10){
			System.out.println(celTemp + "\t\t->\t\t" + 
					(celTemp * 1.8 + 32));
		}
		
		*/
		
		Scanner keyboard  = new Scanner(System.in);
		double temp;
		int choice;
		
		System.out.print("Enter a temp: ");
		temp = keyboard.nextDouble();
		
		System.out.print("Enter 1 to convert Celcious to Farenheit or 2 to convert Farenheit to Celcious: ");
		choice = keyboard.nextInt();
		
		if(choice == 1)
			System.out.println(temp + " in fahrenheit is " + (temp * 1.8 + 32));
		else
			System.out.println(temp + " in cel is " + ((temp - 32) / 1.8));
		
		
		
		
		
		
	}
}
