import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int age;
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("Whats your name? ");
			name = input.nextLine();
		
		System.out.print("Hello "+ name + ".How old are you? ");
		
			age = input.nextInt();
		System.out.print("You don't look " + age + " Years old");
}

}
