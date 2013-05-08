import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int Num1;
		int Num2;

		Scanner Input = new Scanner(System.in);

		System.out.print("Input Num1: ");
		Num1 = Input.nextInt();

		System.out.print("Enter Num2: ");
		Num2 = Input.nextInt();

		System.out.println("Num1\tNum2\tDiv\tMod");
		System.out.print(Num1 + "\t" + Num2 + "\t");
		System.out.print(Num1 / Num2 + "\t");
		System.out.println(Num1 % Num2);
	}
}
