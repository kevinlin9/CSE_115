import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class PS6_Algorithms {



    static int Q1(ArrayList<Integer> input){
        // return the minimum value in the input ArrayList
    	int minVal = Integer.MAX_VALUE;
    	for(Integer i : input)
    		if(i.intValue() < minVal)
    			minVal = i.intValue();
        return minVal;
    }


    static int Q2(ArrayList<Integer> input){
        // return the maximum value in the input ArrayList
    	int maxVal = Integer.MIN_VALUE;
    	for(Integer i : input)
    		if(i.intValue() > maxVal)
    			maxVal = i.intValue();
        return maxVal;
    }


    static int Q3(ArrayList<Integer> input){
        // return the index containing the maximum value in the input ArrayList
    	int maxVal = Integer.MIN_VALUE;
    	int maxIdx = 0;
    	for(int i = 0; i < input.size(); i++) {
    		if(input.get(i).intValue() > maxVal){
    			maxVal = input.get(i).intValue();
    			maxIdx = i;
    		}
    	}
    	return maxIdx;
    }


    static double Q4(ArrayList<Integer> input){
        // return the average of all the values in the input ArrayList
    	double sum = 0.0;
    	for(Integer i : input)
    		sum += i.intValue();
        return sum / input.size();
    }


    static String Q5(HashMap<String, Integer> input){
        // return the key corresponding to the maximum value in the input HashMap
    	int maxVal = Integer.MIN_VALUE;
    	String maxKey = "";
    	for(String key : input.keySet()) {
    		if(input.get(key).intValue() > maxVal) {
    			maxVal = input.get(key).intValue();
    			maxKey = key;
    		}
    	}
        return maxKey;
    }


    static double Q6(ArrayList<Double> input){
        // return the range (max - min) of the values in the input ArrayList
    	double minVal = Double.MAX_VALUE;
    	double maxVal = -9999999999999999999999999.0; // Double.MIN_VALUE < any negative number will return false
    	for(Double d : input) {
    		if(d.doubleValue() < minVal)
    			minVal = d.doubleValue();
    		if(d.doubleValue() > maxVal)
    			maxVal = d.doubleValue();
    	}
        return maxVal - minVal;
    }


    static double Q7(ArrayList<Double> input){
        // Return the rate of change of the values of the input ArrayList. The rate of change is computed with the
        // first and last element of the list using the following formula: (last - first)/first
        //
        // Note: This is similar to computing ROI in hw2
    	
        return (input.get(input.size() - 1) - input.get(0)) / input.get(0);
    }


    static int Q8(ArrayList<Integer> input){
        // Return the 2nd highest value in the input ArrayList
    	int maxVal = Integer.MIN_VALUE;
    	for(Integer i : input)
    		if(i.intValue() > maxVal)
    			maxVal = i.intValue();
    	int secondMax = Integer.MIN_VALUE;
    	for(Integer i : input) {
    		int val = i.intValue();
    		if(val != maxVal && val > secondMax)
    			secondMax = val;
    	}
        return secondMax;
    }


    static int Q9(ArrayList<ArrayList<Integer>> input){
        // Return the minimum value in the input list of lists (matrix)
    	int minVal = Integer.MAX_VALUE;
    	for(ArrayList<Integer> ali : input) 
    		for(Integer i : ali) 
    			if(i.intValue() < minVal)
    				minVal = i.intValue();
        return minVal;
    }


    static String Q10(ArrayList<String> input){
        // return the longest String in the input ArrayList. Ties can be broken arbitrarily
    	int longestLength = Integer.MIN_VALUE;
    	String longestString = "";
    	for(String s : input)
    		if(s.length() > longestLength) {
    			longestLength = s.length();
    			longestString = s;
    		}
        return longestString;
    }


    static double Q11(ArrayList<Integer> input1, ArrayList<Integer> input2){
        // return the average of all the values in both input ArrayLists
    	int totalSize = input1.size() + input2.size();
    	double sum = 0.0;
    	for(Integer i : input1)
    		sum += i.intValue();
    	for(Integer i : input2)
    		sum += i.intValue();
        return sum / totalSize;
    }


    static double Q12(HashMap<String, ArrayList<Double>> input){
        // return the maximum value contained in any of the ArrayLists in the input HashMap.
    	double maxVal = Double.MIN_VALUE;
    	for(String key : input.keySet()) {
    		for(Double d : input.get(key)) {
    			if(d.doubleValue() > maxVal)
    				maxVal = d.doubleValue();
    		}
    	}
        return maxVal;
    }


    static void Q13(ArrayList<Integer> input){
        // sort the input ArrayList in increasing order
    	Collections.sort(input);
    }


    static double Q14(ArrayList<Integer> input){
        // return the median value of the input ArrayList. If the size is even, return the average of the two
        // elements closests to the median
    	double medianValue = 0.0;
    	int size = input.size();
    	if(size % 2 != 0)
    		medianValue = input.get((int)(Math.floor(size / 2.0)));
    	else
    		medianValue = (input.get(size / 2) + input.get(size / 2 + 1) / 2.0); 
    	return medianValue;
    }


    static int Q15(ArrayList<Integer> input){
        // return the mode value of the input ArrayList. Ties can be broken arbitrarily
    	HashMap<Integer, Integer> integerCount = new HashMap<Integer, Integer>();
    	for(Integer i : input)
    		integerCount.putIfAbsent(i, new Integer(0));
    	for(Integer key : input){
    		integerCount.put(key, new Integer(integerCount.get(key) + 1));
    	}
    	int mode = Integer.MIN_VALUE;
    	Integer modeObj = null;
    	for(Integer key : integerCount.keySet())
    		if(integerCount.get(key) > mode) {
    			mode = integerCount.get(key);
    			modeObj = key;
    		}
        return modeObj.intValue();
    }


    public static void main(String[] args) {
    	System.out.println("---Q6---");
    	ArrayList<Double> t2 = new ArrayList<Double>();
    	t2.add(new Double(-1.0));
    	t2.add(new Double(-1.0));
    	System.out.println(Q6(t2));
    	System.out.println("---Q13---");
    	ArrayList<Integer> t1 = new ArrayList<Integer>();
    	t1.add(new Integer(1));
    	t1.add(new Integer(6));
    	t1.add(new Integer(-1));
    	System.out.println(t1);
    	Q13(t1);
    	System.out.println(t1);
    	/* Incorrect Test
    	 * -- Q14 --
			Incorrect on input: [1, 3, 7, 2, 0]
			Expected output : 2.0
			Your output     : 7.0
			Score: 0
    	 */
    }

}
