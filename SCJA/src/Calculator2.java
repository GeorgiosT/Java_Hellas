
import java.util.Scanner;

public class Calculator2 {
	

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner buffer = new Scanner(System.in);
        double num1, num2, result;
        int option;
        
        System.out.print("Enter a number: ");
        num1 = buffer.nextDouble();
        
        System.out.print("Enter a number: ");
        num2 = buffer.nextDouble();
        
        System.out.println("Enter 1 for addition: ");
        System.out.println("Enter 2 for subtraction: ");
        System.out.println("Enter 3 for multiplication: ");
        System.out.println("Enter 4 for division: ");
        System.out.print("Enter an option: ");
        option = buffer.nextInt();

        result = calculate(num1, num2, option);
        
        System.out.println(result);
    }
    
    private static double calculate(double num1, double num2, int option){
        double result;
        switch(option){
            case 1: result = num1 + num2;
                break;
            case 2: result = num1 - num2;
                break;
            case 3: result = num1 * num2;
                break;
            case 4: result = num1 / num2;
                break;
            default: result = 0;
                break;
        }
        return result;
    }
}
