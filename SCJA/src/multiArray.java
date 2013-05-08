public class multiArray {

	public static void main(String[] args) {

		int[][] firstArray = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };

		int[][] secondArray = { { 30, 31, 32, 33 }, { 43, }, { 4, 5, 6 } };

		System.out.println("This is the first Array: ");
		display(firstArray);// we call the display method and we pass on it
							// firstArray

		System.out.println("This is the second Array: ");
		display(secondArray);// we call the display method and we pass on it
								// secondArray

	}

	// We created the method called Display,which takes a multiArray (int x
	// [][])
	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) { // row counter
			for (int column = 0; column < x[row].length; column++) { // column counter
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();

		}

	}
}