public class ArraysExercise2 {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,6,7,5,7};
		change(intArray);// Copy of the array reference NOT the array
							// that is passed to change.
		for(int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println(); // New Line
		
		int myInt = 2;
		change(myInt); // Copy of the value in myInt get passed to change
		System.out.println(myInt);
	}
	
	public static void change(int[] x){
		for(int i = 0; i < x.length; i++){
			x[i] += 5;
		}
	}
		
	public static void change(int x){
		x += 5;
	}
}
