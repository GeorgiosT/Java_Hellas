import java.util.Arrays;
import java.util.Random;

public class LotttoExercise1 {

	public static void main(String[] args) {

		int[] lottoNum = new int[6];

		Random random = new Random();

		System.out.println("Lotto Quick pick");

		for (int i = 0; i < lottoNum.length; i++) {
			int num = random.nextInt(44) + 1;
			lottoNum[i] = num;
			for (int j = i - 1; j >= 0; j--) {
				if (num == lottoNum[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lottoNum);
		for (int num : lottoNum)
			System.out.print(num + ",");

	}

}
