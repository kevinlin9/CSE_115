package code;

import java.util.ArrayList;

public class ClassesAndObjects {
	public static void main(String[] args) {
		System.out.println("9-18-17");
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
		
		System.out.println();
		System.out.println("9-20-17");
		name = "River";
		System.out.println(name.length());
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println(name.indexOf("ive"));
		
		System.out.println();
		System.out.println("Testing protein method:");
		System.out.println(codesForProtein("CGATGTAGCTCAGATCGCTAGACTTGATCG")); // true
		System.out.println(codesForProtein("CGCTGTAGCTCAGATCGCTAGACTTGATCG")); // false		
	}
	public static boolean codesForProtein(String strand) {
		int start = strand.indexOf("ATG");
		int end = strand.indexOf("TGA");
		if (start < 0 || end < 0)
			return false;
		else
			return start < end;
	}
}
