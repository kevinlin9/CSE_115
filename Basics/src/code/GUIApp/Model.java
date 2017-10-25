package code.GUIApp;

public class Model {
	
	private int value;
	
	public Model() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public void increment() {
		value += 1;
	}
	
	public void decrement() {
		value -= 1;
	}
}
