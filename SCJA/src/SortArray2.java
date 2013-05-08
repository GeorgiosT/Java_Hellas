import java.util.*;

public class SortArray2 {

	public static void main(String[] args) {

		int[] array = new int[1000];
		fillArray(array);
		
		long start = System.currentTimeMillis();
		bubbleSort(array);
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("\n\n\n");
		
		int[] array2 = new int[1000];
		fillArray(array);
		
		start = System.currentTimeMillis();
		selectionSort(array2);
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("\n\n\n");
		
		
		int[] array3 = new int[1000];
		fillArray(array);
		
		start = System.currentTimeMillis();
		Arrays.sort(array3);
		System.out.println(System.currentTimeMillis() - start);
				
	}

	private static void fillArray(int[] array) {
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 100);
		}
	}

	private static void selectionSort(int[] array2) {
		for( int x = 0; x<array2.length; x++){
			int index_of_min = x;
			for(int y = x; y < array2.length; y++){
				if(array2[index_of_min] > array2[y])
					index_of_min = y;
			}
			
			//Swap
			int temp = array2[x];
			array2[x] = array2[index_of_min];
			array2[index_of_min] = temp;
			
		}
	}

	private static void bubbleSort(int[] array) {
		for (int index = 0; index < array.length - 1; index++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

		}
	}

}
