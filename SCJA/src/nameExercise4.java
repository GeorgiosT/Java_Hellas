import java.util.Scanner;
public class nameExercise4 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String name;
		int upCounter = 0;
		char myChar1;
		
		System.out.println("Enter your full name: ");
		name = input.nextLine();
	
		for(int i = 0; i < name.length(); i++){
            myChar1 = name.charAt(i);
            if(myChar1 >= 'A' && myChar1 <= 'Z'){
                upCounter ++;
		}
		}
            System.out.println("There are " + upCounter + 
                    " uppercase characters in this name ");
	
	}
	}
