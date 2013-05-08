import java.util.Scanner;
public class Results {

	public static void main(String[] args) {
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Whats your age?");
		age =input.nextInt();
		
		 if(age >=90){
			System.out.println("You are a freaking dinosaur!!!!");
		 }
			else if (age >= 60) {
			System.out.println("You are an old fart!");
		}
		else if(age >=50){
			System.out.println("Shitty situation!");
		}
		else if(age >=40){
			System.out.println("Hold on man!");
		}
		else if(age >=30){
			System.out.println("Not too bad");
		}
		else if(age <30){
			System.out.println("Damn kids :P");
		}
		else{
			System.out.println("You need to try again :P");
		}

		
	}

}
