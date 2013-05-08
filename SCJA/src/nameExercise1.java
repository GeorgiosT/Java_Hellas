import java.util.Scanner;
public class nameExercise1 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		String Surname;
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		Surname =  name.substring(name.indexOf(' '),name.length());
		System.out.println(Surname );
	}

}
