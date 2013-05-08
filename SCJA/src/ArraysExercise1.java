public class ArraysExercise1 {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 6, 7, 5, 7 };
		String[] stringArray = { "Cat", "Dog", "Mouse", "Duck" };

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

		
		for (@SuppressWarnings("unused") int x : intArray)//shortcut for the 1st for loop
			x = 100;
		
		for (int x : intArray)
			System.out.println(x);

	}
}
