
public class Tester {

	
	public static void main(String[] args) {
		Time now = new Time();
		System.out.println(now.toMilitary());

		now.setTime(9, 13, 30);
		System.out.println(now.toMilitary());
		
		now.setTime(11,99,32);
		System.out.println(now.toMilitary());
	
		System.out.println(now.toString());
		
		System.out.println(now);
	
	
	
	
	}

}
