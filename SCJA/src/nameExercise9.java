import java.util.Scanner;
public class nameExercise9 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		String Surname;
		String Firstname;
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		Firstname =  name.substring(0,name.indexOf(' '));
		Surname =  name.substring(name.lastIndexOf(' '),name.length());
	
		
		System.out.print(Firstname + " " + Surname);
	}

}



