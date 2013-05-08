import java.util.ArrayList;


public class Hooks {

		public static void main(String[] args) {
	
			int hookSizes[] = { 1, 1, 1, 2, 2, 4, 5, 5, 5, 6, 7, 8, 8, 9 };
			for (int hook: hookSizes) 
				System.out.print(hook + " ");{


			}
			
			//Integer hookSizeList;
			ArrayList<Integer> hookSizesList = new ArrayList<Integer>();
			hookSizesList.add(1);
			hookSizesList.add(4);
			hookSizesList.add(5);
			
			for (Integer hook : hookSizesList){ 
				System.out.print(hook + " ");
				
			}
	
			System.out.println("\n\n");
	
			/*Second program======================*/
			
			
			//Float fishLengthList
			ArrayList<Float> fishLengthList = new ArrayList<Float>();
			fishLengthList.add((float) 10.0);// or (10.0f);
			fishLengthList.add((float) 15.5);// or (15.5f);
			fishLengthList.add((float) 18.0);// or (18.0f);
			fishLengthList.add((float) 29.5);// or (29.5f);
			fishLengthList.add((float) 45.5);// or (45.5f);
		
			for (Float bass : fishLengthList)
				if (bass>=28f){
				System.out.print(bass+" \t");
				}
		
		}
}
