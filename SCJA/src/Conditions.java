public class Conditions {

	public static void main(String[] args) {
		int boy, girl;
		boy = 18;
		girl = 50;

		if (boy++ > 20 ^ girl++ < 60) {
			System.out.println("You can enter");
		} else {
			System.out.println("You are too young");
		}
		System.out.println(boy);
		System.out.println(girl);

	
		System.out.println("Hello \\ \" \t \n World");
	}
}
