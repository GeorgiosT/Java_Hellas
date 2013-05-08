import java.util.Scanner;

public class nameExercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		char myChar1;
		
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
		int count = 0;
		
		for(int i =name.length()-1; i>=0;i--){ 
			
			System.out.print(name.charAt(i));
		}

		}
	}
	
				
	
			
	
