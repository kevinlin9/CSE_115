import java.util.ArrayList;
import java.util.HashMap;

public class DataStructuresChallengePS {

    // 2 points
    static HashMap<String, Integer> Q1(ArrayList<String> inputList){
        // Return a HashMap containing all the input Strings as keys with values equal to the length of each String
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for(String s : inputList)
    		map.put(s, s.length());
        return map;
    }

    // 3 points
    static int Q2(ArrayList<ArrayList<Integer>> inputList){
    	int sum = 0;
        // Return that sum of all the provided Integers. Note that you are given a ArrayList containing an unknown
        // number of ArrayLists of Integers (A Matrix of Integers)
    	for(ArrayList<Integer> list : inputList)
    		for(Integer i : list)
    			sum += i.intValue();
        return sum;
    }

    // 5 points
    static ArrayList<Integer> Q3(ArrayList<Integer> input1, ArrayList<Integer> input2){
    	ArrayList<Integer> intersection = new ArrayList<Integer>();
        // Return an ArrayList containing all the integers that are contained in both the input ArrayLists
        // (Set/List Intersection)
    	for(Integer i : input1)
    		if(input2.contains(i))
    			intersection.add(i);
        return intersection;
    }

    // 5 points
    static ArrayList<Integer> Q4(ArrayList<Integer> inputList, HashMap<Integer, Boolean> inputMap){
    	ArrayList<Integer> values = new ArrayList<Integer>();
        // Return an ArrayList containing, for each int in the inputlist:
        // -The int as-is if the inputMap stores the value true at the key equaling the int
        // -The negative of the int if the inputMap stores the value false at the key equaling the int
        // -Do not store the int if it is not contained in the inputMap as a key
    	for(Integer i : inputList) {
    		if(inputMap.get(i) != null)
    			if(inputMap.get(i) == true)
    				values.add(i);
    			else
    				values.add(new Integer(-i.intValue()));
    	}		
        return values;
    }
    public static void main(String[] args) {}

}
