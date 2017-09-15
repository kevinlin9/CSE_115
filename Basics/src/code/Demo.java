package code;

public class Demo {
	public int review(int a, String b) {
		System.out.print(b);
		System.out.print(": ");
		System.out.println(a);
		return 3 * a - 5;
	}
	public int postage(boolean isMetered) {
		if(isMetered)
			return 46;
		else
			return 49;
	}
	public int max(int a, int b) {
		if(a > b) 
			return a;
		else
			return b;
	}
	public int compare(int a, int b) {
		if (a == b)
			return 0;
		else
			if (a > b)
				return 1;
			else {
				return -1;
			}
	}
	public void example(boolean w) {
		if(w)
			System.out.println("We did the then-block");
		else
			System.out.println("We did the else-block");
		System.out.println("Done with the conditional statement.");
	}
	public void printMessage(int howManyTimes) {
		System.out.println("I ");
		for(int i = 0; i < howManyTimes; i++) {
			System.out.println("love ");
		}
		System.out.println("chocolate.");
	}
	public void begin() {
		// Code separated by a line are from different class days.
		int x = 1;
		String s = "Some value";
		System.out.println(review(x, s));
		System.out.println(review(3, "The value is"));
		System.out.println();
		
		System.out.println(postage(true));
		System.out.println(postage(false));
		System.out.println();		
		x = 5;
		int y = -7;
		System.out.println(max(x, y));
		System.out.println(compare(x, y));
		System.out.println();
		
		int a = 5;
		int b = -7;
		example(a > b);
		printMessage(4);
		
	}
	public static void main(String[] args) {
		Demo myDemo = new Demo();
		myDemo.begin();
	}
}
