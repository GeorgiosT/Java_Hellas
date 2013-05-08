import java.util.Scanner;
public class nameExercise8 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		int counter =0;
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		for(int i=0;i< name.length();i++){
			if(name.charAt(i) == 'a' || name.charAt(i) == 'A'){
				counter++;
			}
		}
		System.out.println("The number of 'a's and 'A's on this name is: " + counter);

}
}