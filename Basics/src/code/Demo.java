package code;

public class Demo {
	public void begin() {
		int x = 1;
		String y = "Some value";
		System.out.println(review(x, y));
		System.out.println(review(3, "The value is"));
		System.out.println();
	}	
	public int review(int a, String b) {
		System.out.print(b);
		System.out.print(": ");
		System.out.println(a);
		return 3 * a - 5;
	}	
	public void begin2() {
		System.out.println(postage(true));
		System.out.println(postage(false));
		System.out.println();
	}	
	public int postage(boolean isMetered) {
		if(isMetered)
			return 46;
		else
			return 49;
	}	
	public void begin3() {
		int x = 5;
		int y = -7;
		System.out.println(max(x, y));
		System.out.println(compare(x, y));
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
	public static void main(String[] args) {
		Demo myDemo = new Demo();
		myDemo.begin();
		myDemo.begin2();
		myDemo.begin3();
	}
}
