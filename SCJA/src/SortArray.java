import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {

		int[] array = { 2, 3, 1, 5, 4 };

		for (int index = 0; index < array.length; index++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					// Swap
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

			for (int x : array)
				System.out.print(x + " ");
			System.out.println();
		}
		System.out.println("\n\n\n");

		int[] array2 = { 2, 3, 1, 5, 4 };
		for (int x = 0; x < array2.length; x++) {
			int index_of_min = x;

			for (int y = 0; y < array.length; y++) {
				if (array2[index_of_min] > array2[y])
					index_of_min = y;
			}
			// swap
			int temp = array2[x];
			array2[x] = array2[index_of_min];
			array2[index_of_min] = temp;

			for (int myX : array2)
				System.out.print(myX + " ");
			System.out.println();
		}
		System.out.println("\n\n\n");
		
		int[] array3 = {2,3,1,5,4};
		Arrays.sort(array3);
		for (int x : array3)
			System.out.print(x +" ");
		
	
	               
	}
}
