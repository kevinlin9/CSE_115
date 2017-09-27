package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DataStructures {
	//HashMap
	public static void test() {
		HashMap<String, Integer> itemPrices = new HashMap<String, Integer>();
		itemPrices.put("watch", 850);
		itemPrices.put("luggage", 1099);
		itemPrices.put("home theatre", 2100);
		System.out.println(itemPrices);
		
		int luggagePrice = itemPrices.get("luggage");
		System.out.println(luggagePrice);
		System.out.println(itemPrices.get("home theatre"));
		
		int numberOfKeyValuePairs = itemPrices.size();
		System.out.println(numberOfKeyValuePairs);
		
		System.out.println(itemPrices.containsKey("watches"));
		System.out.println(itemPrices.containsValue(2100));
		
		System.out.println("---Print out everything in HashMap---");
		for(String item : itemPrices.keySet())
			System.out.println("The " + item + " costs $" + itemPrices.get(item));
		
	}
	//Algorithm for the average of an array list of integers
	public static void average(ArrayList<Integer> integers) {
		System.out.println("Finding average of " + integers);
		int sum = 0;
		for(int value : integers)
			sum += value;
		double average = (double)sum / integers.size();
		System.out.println("The average is " + average);
	}
	public static ArrayList<Integer> makeArrayList(int min, int max, int size){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < size; i++)
			al.add(new Integer(getRandomInteger(min, max)));
		return al;
	}
	public static int getRandomInteger(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // more efficient and random than (int)(Math.random() * (max - min + 1)) + min;
	}
	public static void main(String[] args) {
		test();		
		average(makeArrayList(1, 2, 10));
	}
}
