package code;

public class Java {
	
	public static int total(int howMuch, int quantity) {
		return howMuch * quantity;
	}
	public static void receipt(int total) {
		System.out.println("Your total price is $" + total + ".");
	}
	public static void main(String[] args) {
		int apples = 10;
		int price = 1;
		receipt(total(price, apples));
	}
	
}
