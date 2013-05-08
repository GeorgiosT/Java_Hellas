import java.util.Scanner;
public class Exercise3 {

	
	public static void main(String[] args) {
		int numOfNumbers;
		int largest= Integer.MIN_VALUE;
		int smallest= Integer.MAX_VALUE;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers? ");
		numOfNumbers = input.nextInt();
		
		for(int i=0;i<numOfNumbers;i++){
			System.out.println("Please insert a number: ");
			int num = input.nextInt();
			
			total = total += num;
			if(num>largest)
				largest = num;
			if(num<smallest)
					smallest = num;
		}
			System.out.println("The largest number entered was: " + largest);
			System.out.println("The smallest number entered was: " + smallest);
			System.out.println("The average of the numbers entered is:" +(total/numOfNumbers));
		
		
	}

}
