import java.util.Scanner;
public class nameExercise2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		String Surname;
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		Surname =  name.substring(0,name.indexOf(' '));
		System.out.println(Surname );
	}

}
