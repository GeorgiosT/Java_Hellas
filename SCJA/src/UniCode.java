

public class UniCode {

	public static void main(String[] args) {
		char x;
		for (int i = 0; i < 10000; i++) {
			x = (char) i;
			System.out.print(x + "\t");

			if (i % 7 == 0)
				System.out.println();
		
		
		}
 
		
	}
}