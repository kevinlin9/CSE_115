import java.util.ArrayList;
import java.util.Collections;

public class VariablesChallengePS {




    // 2 points
    static double Q1(double a, double b, double c) {
        // TODO: Step 1. Compute the sum (addition) of the 3 input variables divided by a
        // TODO: Step 2. Return the multiplication of the result from step 1 times 1.5
    	double s1 = (a + b + c) / a;
        return s1 * 1.5;
    }



    // 3 points
    static int Q2(int a, int b, int c, int d, int e) {
        // TODO: Step 1. Compute the sum (addition) of the 5 input variables multplied by c
        // TODO: Step 2. Subtract 10 from the result of step 1
        // TODO: Step 3. Return the result from step 2 multiplied by e
    	int s1 = (a + b + c + d + e) * c;
    	int s2 = s1 - 10;
        return s2 * e;
    }



    // 5 points
    static String Q3(String a, String b, String c) {
        // TODO: Return a single String which is the concatenation of the three input values
        // TODO: separated by spaces, in alphabetical order.
        // example, if a is "lager", b is "ale", and c is "stout", the return value should be "ale lager stout"
    	String result = "";
    	ArrayList<String> stringArr = new ArrayList<String>();
    	stringArr.add(a);
    	stringArr.add(b);
    	stringArr.add(c);
    	Collections.sort(stringArr);
    	for(String string : stringArr)
    		result += string + " ";
    	result = result.trim();
        return result;
    }



    // 5 points
    static boolean Q4(int a, double b, String c, boolean d) {
        // TODO: If a divided by b is greater than, or equal to, the length of c, return the value of d.
        // TODO: If a divided by b is less than the length of c, return the inverse of the value of d
    	if(a / b >= c.length())
    		return d;
   		return !d;   	
    }




    public static void main(String[] args) {

        // You can optionally use this main method to test your code without having to submit.
        // This main method will not be graded
    	String a = "lager";
    	String b = "ale";
    	String c = "stout";
    	Q3(a, b, c);
    }

}
