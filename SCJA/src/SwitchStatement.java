import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int age;
		Scanner input = new Scanner(System.in);

		System.out.print("Age:");
		age = input.nextInt();

		switch (age) {

		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can walk");
			break;
		case 3:
			System.out.println("You can run");
			break;
		default:
			System.out.println("Go to School");
			break;
		}

	}
}


