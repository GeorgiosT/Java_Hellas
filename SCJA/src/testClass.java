import java.util.Random;
public class testClass {

	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int bucky[] = { 32, 12, 18, 54, 2 };

		for (int counter = 0; counter < bucky.length; counter++) {
			System.out.println(counter + "\t" + bucky[counter]);
		}

		Random rand = new Random();
		int freq[] = new int[7];

		for (int roll = 1; roll <= 1000; roll++) {
			++freq[1 + rand.nextInt(6)];

		}
		System.out.println("Face\tFrequency");

		for (int face = 0; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);
		}

	}

}
