import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PS4_DataStructures {


    static int Q1(ArrayList<Integer> listOfNumbers){
        // return the number of integers in listOfNumbers

        return listOfNumbers.size();
    }

    static void Q2(ArrayList<String> input){
        // add the String "movie" to the end of the input list
    	input.add("movie");
    }

    static int Q3(ArrayList<Integer> input, int index){
        // return the element at index i from the input list
        // You can assume the input contains at least i+1 values

        return input.get(index);
    }

    static boolean Q4(ArrayList<Integer> input, int value){
        // return true if value is in the input list, false otherwise
    	for(Integer i : input)
    		if(i.intValue() == value)
    			return true;
    	return false;
    }

    static String Q5(ArrayList<String> words){
        // return a string containing every word of the input concatenated into a single String and separated by spaces
        // Example: If the input is ["war", "never", "changes"] the output is "war never changes"
    	String result = "";
    	for(String s : words)
    		result += s + " ";
    	result.trim();
        return result;
    }

    static ArrayList<Integer> Q6(){
        // Create and return an ArrayList of the integers 1 through 10 (including 1 and 10)
    	ArrayList<Integer> r = new ArrayList<Integer>();
    	for(int i = 1; i < 11; i++)
    		r.add(new Integer(i));
        return r;
    }

    static ArrayList<String> Q7(){
        // create and return an ArrayList of Strings containing the strings "memory", "is", "the", "key" in that order
    	String[] a = {"memory","is","the","key"};
        return new ArrayList<String>(Arrays.asList(a));
    }

    static void Q8(HashMap<String, Integer> input, String key, int value){
        // add an entry into the map with the the given key and value
    	input.put(key, value);
    }

    static boolean Q9(HashMap<Integer, Boolean> input, int key){
        // return the value in the input map at the given key
        return input.get(key);
    }

    static boolean Q10(HashMap<String, Integer> input, int value){
        // return true if value is in the input map as a value at any key, false otherwise
    	for(String key : input.keySet())
    		if(input.get(key).intValue() == value)
    			return true;
        return false;
    }

    static int Q11(HashMap<String, Double> input){
        // return the number of entries in the input map
        return input.size();
    }

    static ArrayList<Integer> Q12(HashMap<String, Integer> input){
        // return a list of all values in the input map
        // Note: input.values() returns a Collection, but you must return an ArrayList
        return new ArrayList<Integer>(input.values());
    }

    static ArrayList<String> Q13(HashMap<String, Integer> input){
        // return a list of all keys in the input map
        // Note: input.keySet() returns a Set, but you must return an ArrayList

        return new ArrayList<String>(Arrays.asList(input.keySet().toArray(new String[input.size()])));
    }

    static boolean Q14(HashMap<Integer, Integer> input, int key){
        // return true if key is a key in the input map, false otherwise
        return input.containsValue(input.get(key));
    }

    static int Q15(HashMap<Integer, Integer> input, int value){
        // return the number of times value is in the input map as a value
    	int times = 0;
    	for(Integer key : input.keySet())
    		if(input.get(key).intValue() == value)
    			times++;
        return times;
    }

    public static void main(String[] args) {
    	
    }
}
