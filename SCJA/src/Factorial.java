import java.util.Scanner;


public class Factorial {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();
		
		// Calls Recursive method
		System.out.println(fact(num));
		
		// Factorial with for loop
		double factorial = 1;
		for(int i = num; i > 1; i--){
			factorial *= i;
		}
		System.out.println(factorial);
		
		// Factorial with while loop
		factorial = 1;
		while(num >0){
			factorial *= num--;
		}
		System.out.println(factorial);
		
		
	}
	
	// Recursive method can call itself - We will cover these later.
	public static double fact(int n){
		if(n > 1)
			return n * fact(n - 1);
		else
			return 1L;
			
	}

}
