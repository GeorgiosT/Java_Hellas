public class Bicycle {

	//Instance variables
	private int speed;
	@SuppressWarnings("unused")
	private int gear;
	@SuppressWarnings("unused")
	private int cadence;
	public int bicycleID;

	//class variable
	private static int bicycleNumber = 1;

	// Class constructor
	public Bicycle() {
		setSpeed(0);
		gear = 1;
		cadence = 0;
		bicycleID = bicycleNumber++;
	}

	// method
	public void speedUp(int increment) {
		setSpeed(getSpeed() + increment);
	}

	// method
	public void applyBrake(int decrement) {
		setSpeed(getSpeed() - decrement);
	}

	// method
	public void changeGear(int newGear) {
		gear = newGear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
