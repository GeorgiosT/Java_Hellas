import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		String name;

		name = getInput("Enter your full name: ");

		String s1 = name.substring(0,name.indexOf(' '));
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
