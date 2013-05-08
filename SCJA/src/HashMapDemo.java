import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println("Map empty: " + map.isEmpty());

		map.put("John", 70);
		map.put("Mary", 93);
		map.put("Karl", 65);
		map.put("Betty", 80);
		map.put("Betty", 50);

		System.out.println("Map empty: " + map.isEmpty());
		System.out.println("Map size: " + map.size());

		System.out.println("Value for Karl is: " + map.get("Karl"));
		System.out.println("Value for John is: " + map.get("Jane"));

		System.out.println(map);

		for (String key : map.keySet()) {
			System.out.println("Value for  " + key + " is " + map.get(key));
		}

	}

}
