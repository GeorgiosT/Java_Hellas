public class GetterSetterDemo {

	public static void main(String[] args) {
		TestObject test1 = new TestObject();
		// Compiler error value1 is not visible outside the class
		// System.out.println(test1.value1);

		System.out.println(test1.getValue1());

		// test1.value1 = 9; Compiler error
		test1.setValue1(9);

		System.out.println(test1.getValue1());
	}

}

class TestObject {
	private int value1 = 5;
	int value2 = 6;
	protected int value3 = 7;
	public int value4 = 8;

	public void setValue1(int value) {
		value1 = value;
	}

	public int getValue1() {
		return value1;
	}
}