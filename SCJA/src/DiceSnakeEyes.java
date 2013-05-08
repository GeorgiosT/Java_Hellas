import java.util.Random;

public class DiceSnakeEyes {

	
	public static void main(String[] args) {
		int roll1,roll2;
		int rollsCounter=0;
		
		Random dice1 = new Random();
		Random dice2 = new Random();
		
		
		
		
		do{
			roll1=dice1.nextInt(7);//or roll1=(int)(Math.random()*6+1);
			System.out.print(roll1 +" ");
			
			roll2 =dice2.nextInt(7);//& roll2=(int)(Math.random()*6+1);
			System.out.println(roll2+" ");
			
			rollsCounter++;
		}
		while(roll1 !=1 || roll2 !=1);
		
		
		System.out.println("Number of tries before Snake eyes : " + rollsCounter);

		}	
}
