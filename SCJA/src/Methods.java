import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		String s;

		s = getInput("Enter your full name: ");

		

		Character.isDigit(s.charAt(4));
		Character.isLetter(s.charAt(2));
		Character.isLowerCase(s.charAt(1));
		Character.isUpperCase(s.charAt(3));
		boolean isSpace = (s.charAt(3) == ' ');
		
		
		 String s1 = s.substring(0,s.indexOf(' '));
		 System.out.println(s1);
		
		
		
		
		
	}

	

	private static String getInput(String prompt) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.println(prompt);
		s = input.nextLine();
		return s;
	}
}
