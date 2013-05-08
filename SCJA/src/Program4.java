import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = input.nextInt();

		System.out.println("Enter second number: ");
		num2 = input.nextInt();

		if(num1%num2==0){
			System.out.println("The 2 numbers are exactly divisible");
		}
			else
			{
				System.out.println("The 2 numbers are not exactly divisible");
			}
		}
	}



