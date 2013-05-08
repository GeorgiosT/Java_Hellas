import java.util.Scanner;
public class TestFromBook25{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Temp:");
		int waterTemperature = input.nextInt();
		
		boolean isStripersMostActive=true;
		
		if(waterTemperature >= 69)
			isStripersMostActive = false;
		
		else if(waterTemperature < 69 && waterTemperature > 47)
			isStripersMostActive = true;
		
		else if (waterTemperature <= 47)
			isStripersMostActive=false;
		
	
		System.out.println(isStripersMostActive);
	}

	}


