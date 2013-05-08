import java.util.Scanner;
public class Calculator {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner jorgos = new Scanner(System.in);
		int num1,num2,answer;
		
		System.out.print("Enter num1:");
		num1 = jorgos.nextInt();
		
		System.out.print("Enter Num2:");
		num2 = jorgos.nextInt();
		
		answer = num1 + num2;
		
		System.out.println(answer);

	}

}
