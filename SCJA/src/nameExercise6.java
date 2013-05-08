import java.util.Scanner;
public class nameExercise6 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		String Surname;
		String Firstname;
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		Surname =  name.substring(name.indexOf(' '),name.length());
		Firstname =  name.substring(0,name.indexOf(' '));
		
		System.out.print(Surname + " " + Firstname );
	}

}


