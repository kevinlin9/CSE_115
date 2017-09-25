package code;

import java.util.HashMap;

public class DataStructures {
	//HashMap
	public static void test() {
		HashMap<String, Integer> mapOfStringsToDoubles = new HashMap<String, Integer>();
		mapOfStringsToDoubles.put("watch", 850);
		mapOfStringsToDoubles.put("luggage", 1099);
		mapOfStringsToDoubles.put("home theatre", 2100);
		System.out.println(mapOfStringsToDoubles);
		
		int luggagePrice = mapOfStringsToDoubles.get("luggage");
		System.out.println(luggagePrice);
		System.out.println(mapOfStringsToDoubles.get("home theatre"));
		
		int numberOfKeyValuePairs = mapOfStringsToDoubles.size();
		System.out.println(numberOfKeyValuePairs);
		
		System.out.println(mapOfStringsToDoubles.containsKey("watches"));
		System.out.println(mapOfStringsToDoubles.containsValue(2100));
	}
	public static void main(String[] args) {
		test();
	}
}
