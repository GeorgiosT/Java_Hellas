import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String[] strArray = { "Brian", "Joe", "Tom", "Ryan", "Rio", "Wayne","Robin" };// declares a string array

		ArrayList<String> names = new ArrayList<String>();// declares an ArrayList of Strings

		ArrayList<Integer> ages = new ArrayList<Integer>();// declares an ArrayList of Integers

		// boolean -> Boolean
		// char -> Character
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> Float
		// double -> Double

		names.add("Georgios");
		names.add("Joe Doe");
		names.add("Tom Jones");
		names.add("Ryan Giggs");
		names.add("Rio Ferdinard");
		names.add("Wayne Rooney");
		names.add("Robin Van Persie");

		System.out.println(names);
		System.out.println(names.size());

		names.add(3, "Jim Murphy"); // adds the name on index 3

		System.out.println(names);
		System.out.println(names.size());

		System.out.println();// blank line
		
		names.remove(0); // removes name from index 0
		System.out.println(names);
		
		System.out.println();// blank line
		
		names.remove("Tom Jones"); // removes "Tom Jones" from the List
		System.out.println(names);
		
		System.out.println();// blank line
		
		System.out.println(names.remove("Tom Jones"));// gives a true or false value
		System.out.println(names);
		
		while (names.remove("Tom Jones"));// while it's true, it removes "Tom Jones"
		
		System.out.println();// blank line

		names.set(0, "Joseph Doe");// update or change the current value at index 0
		System.out.println(names);

		System.out.println();// blank line
		
		

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));// prints the list in a column form
		}
		System.out.println();// blank line

		for (String str : names) {
			System.out.println(str);// Prints all names to the screen
		}
		System.out.println();// blank line

		// Prints all names to the screen
		@SuppressWarnings("rawtypes")
		Iterator indivItems = names.iterator();
		while (indivItems.hasNext()) {
			System.out.println(indivItems.next());
		}

		System.out.println();// blank line
		
		ages.add(25);
		ages.add(22);
		ages.add(63);
		ages.add(46);
		ages.add(30);

		for (@SuppressWarnings("unused") Integer x : ages) {// values in aray list do NOT change!
			x = 21;
		}
		for (Integer x : ages) {
			System.out.println(x);
		}

		// -------------------------------------------
		
		System.out.println();// blank line
		
		// changes all values to 21
		for (int i = 0; i < ages.size(); i++) {
			ages.set(i, 21);
		}
		for (Integer x : ages) {
			System.out.println(x);
		}

		System.out.println();// blank line
		
		// Change all values to 25
		int index = 0;
		@SuppressWarnings("rawtypes")
		Iterator it = ages.iterator();
		while (it.hasNext()) {
			ages.set(index, 25);
			it.next();
			index++;
		}
		for (Integer x : ages) {
			System.out.println(x);

		}
	}
}
