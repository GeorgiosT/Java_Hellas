import java.util.Scanner;
public class Temperature {

	public static void main(String[] args){
		double cel;
		double fah;
		System.out.println("Insert a celcious temperature: ");
		Scanner input = new Scanner(System.in);
		
		cel = input.nextInt();
		fah = (cel * 9 / 5) + 32;
	
		System.out.println("Celcious" + "\t" + "Fahrenheit");
		System.out.println(cel + "\t\t" + fah);
	}
}

