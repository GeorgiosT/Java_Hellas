import java.util.Random;

public class AlternativeRandomNumbers {

	public static void main(String[] args) {
		
		int[] possibleNumbers = {
				1,2,3,4,5,6,7,8,9,
				10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,
				30,31,32,33,34,35,36,37,38,39,
				40,41,42,43,44,45,46,47,48,49,
				50
		};
		
		System.out.println("6 Random numbers");
		Random numGen = new Random();
		
		for(int i = 0; i < 500000; i++){
			int temp;
			int pos1 = numGen.nextInt(50);
			int pos2 = numGen.nextInt(50);
			
			temp = possibleNumbers[pos1];
			possibleNumbers[pos1] = possibleNumbers[pos2];
			possibleNumbers[pos2] = temp;
		}
		
		for(int i = 0; i < 6; i++){
			System.out.print(possibleNumbers[i] + " ");
		}
	}
}