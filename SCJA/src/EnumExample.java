public class EnumExample {

	
	enum CompassPoints {
		North, South, East, West
	};

	public static void main(String[] args) {
	
		CompassPoints myDirection = CompassPoints.North;

		switch(myDirection){
		case North:
		System.out.println("Say Hi to Santa");
		break;
		
		case South:
			System.out.println("Bring your shorts");
		break;
		
		case West:
			System.out.println("Are you poing to the beach?");
		break;
		
		case East:
			System.out.println("Bring a hat");
			break;
			
		}
		//Prints out all possible values of CompassPoints variable
		for(CompassPoints direction : CompassPoints.values() )
		System.out.println(direction);
		
	}
}
