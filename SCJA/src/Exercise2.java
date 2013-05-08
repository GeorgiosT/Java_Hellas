
public class Exercise2 {

	
	public static void main(String[] args) {
		
		
		int[]  anArray={1,23,4,6,5,23,12,34,56,3,12,24};
		int first12 = -1;
		int last12 = -1;
		
		for(int i = 0; i < anArray.length;i++){
		if(anArray[i] == 12){
			first12 = i;
			break;
		}
		}
		for(int i = anArray.length - 1;i >= 0; i--){
			if(anArray[i] == 12){
				last12 = i;
				break;
		}
		}
			System.out.println("First occurence of 12: " + first12);
	System.out.println("Last occurence of 12: " + last12);
		
	}
		}

