public class Shop {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bike Shop");

		Bicycle myBike = new Bicycle();
		myBike.setSpeed(25);
		System.out.println(myBike.bicycleID);
		System.out.println(myBike.getSpeed());

		Bicycle my2ndBike = new Bicycle();
		my2ndBike.setSpeed(15);
		System.out.println(my2ndBike.bicycleID);
		System.out.println(my2ndBike.getSpeed());
		
		Bicycle my3rdBike = new Bicycle();
		my3rdBike.setSpeed(80);
		System.out.println(my3rdBike.bicycleID);
		System.out.println(my3rdBike.getSpeed());
	}

}
