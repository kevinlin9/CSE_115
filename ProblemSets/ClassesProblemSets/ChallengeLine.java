import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ChallengeLine{


    // In this problem set you will create a class to represent lines defined by their slope and y-intercept (y=mx+b).
    // An understanding of linear geometry is assumed.


    // 2 points
    // Q1: Setup this class to contain doubles "m" (slope) and "b" (y-intercept) with getters/setters and a constructor to
    // initialize these values
    // -Create private instance variables "m" and "b" as doubles
    // -Write getter and setter methods for "m" and "b" following the standard naming convention (ie. getM, setB)
    // -Write a constructor that takes 2 doubles and sets the values of "m" and "b". The first parameter should
    //  correspond to "m" and the second corresponds to "b"
	private double m;
	private double b;
	
	public ChallengeLine(double slope, double yIntercept) {
		m = slope;
		b = yIntercept;
	}
	public double getM() {
		return m;
	}
	public double getB() {
		return b;
	}
	public void setM(double slope) {
		m = slope;
	}
	public void setB(double yIntercept) {
		b = yIntercept;
	}
    // 3 points
    // Q2: Write a non-static method named evaluate that takes a double as a parameter and returns a double. The method
    // returns the y value of the point on this line with the input parameter being the x value of the point.
	public double evaluate(double x) {
		return m * x + b;
	}
    // 5 points
    // Q3: Write a non-static method named intersection that takes an instance of ChallengeLine as a parameter and
    // returns an instance of the PointXY class (provided) at the intersection of the input line and this line.
	public PointXY intersection(ChallengeLine line) {
		double x = (line.getB() - this.getB()) / (this.getM() - line.getM());
		double y = evaluate(x);
		return new PointXY(x, y);
	}
    // 5 points
    static void Q4(ArrayList<ChallengeLine> input, double x){
        // Sort the input ChallengeLine's by their evaluation at x
        // Note: This is much more difficult then the previous 3 questions and will require concepts not yet covered
        //       when this assignment was released.
    	Comparator<ChallengeLine> evaluateChallengeLines = new Comparator<ChallengeLine>() {
    		public int compare(ChallengeLine l1, ChallengeLine l2) {
    			return Double.compare(l1.evaluate(x), l2.evaluate(x));    			
    		}
    	};
    	Collections.sort(input, evaluateChallengeLines);
    }
}
