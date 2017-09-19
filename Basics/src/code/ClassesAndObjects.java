package code;

import java.util.ArrayList;

public class ClassesAndObjects {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		ArrayList<String> anotherList = new ArrayList<String>();
		String name = "Mal";
		myList.add(name);
		anotherList.add("Kaylee");
		anotherList.add("Wash");
		System.out.println(myList);
		System.out.println(anotherList);
		System.out.println(anotherList.size());
		for (int i = 0; i < anotherList.size(); i++) {
			System.out.println(anotherList.get(i));			
		}
	}
}
