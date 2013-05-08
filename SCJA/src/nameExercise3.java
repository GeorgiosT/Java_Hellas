import java.util.Scanner;
public class nameExercise3 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		//int count = 0;
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		/*method2:
		for(int i = 0;i < name.length();i++){
		if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' ||
		name.charAt(i) >= 'a' && name.charAt(i) <= 'z'
		count++;
		System.out.println("The number of characters in the name is: " + name.length());*/
		
		System.out.println("The number of characters in the name is: " + name.length());
	}

}
