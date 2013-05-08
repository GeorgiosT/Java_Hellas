public class TempConverter {

	public static void main(String[] args) {

		System.out.println("Cel\t\t->\t\t Fah");
		System.out.println("=====================================");

		for (int celcious = -50; celcious <= 100; celcious += 10) {
			System.out.println(celcious + "\t\t->\t\t" + (celcious * 1.8 + 32));

		}

		int number = 55;

	}

}
