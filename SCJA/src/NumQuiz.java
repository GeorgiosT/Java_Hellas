import java.util.Scanner;

public class NumQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, max, min;
		int total = 0;
		int count = 0;

		System.out.println("Enter a number: ");
		num = input.nextInt();
		total += num;
		max = num;
		min = num;
		count++;

		while (num != 0) {
			System.out.println("Enter a number:  ");
			num = input.nextInt();
			total += num;
			count++;
			if (num > max) 
				max = num;
			if (num < min)
				min = num;
			
		}

		System.out.println("The biggest number entered was: " + max);
		System.out.println("The smallerst number entered was: " + min);
		System.out.println("the average of the number entered is:"
				+ (total / count));
			}
	
		}
		
