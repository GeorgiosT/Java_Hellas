import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		Random random = new Random();
		int stringLength = random.nextInt(50);
		StringBuilder randomSB = new StringBuilder();

		for (int i = 0; i < stringLength; i++) {
			char randChar = (char) (random.nextInt(95) + 32);
			randomSB.append(randChar);
		}

		String randomString = randomSB.toString();

		System.out.println(randomString);
	}

}
