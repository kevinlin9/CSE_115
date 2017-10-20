import java.util.ArrayList;
import java.util.Comparator;

public class AlgorithmsChallengePS {



    // 2 points
    static ArrayList<Integer> Q1(ArrayList<Integer> input, int k){
        // return an ArrayList containing the k largest elements from input
    	ArrayList<Integer> largestElements = new ArrayList<Integer>();
    	for(int i = 0; i < k; i++) {
    		int maxVal = Integer.MIN_VALUE;
    		Integer anInteger = null;
    		for(Integer integer : input) {
    			if(!largestElements.contains(integer) && integer.intValue() > maxVal) {
    				maxVal = integer.intValue();
    				anInteger = integer;
    			}
    		}
    		largestElements.add(anInteger);
    	}
        return largestElements;
    }


    // 3 points
    static double Q2(ArrayList<Integer> input){
        // return the standard deviation of the values in the input ArrayList
    	double sum = 0.0;
    	double size = input.size();
    	for(Integer i : input)
    		sum += i.intValue();
    	double mean = sum / size;
    	double temp = 0;
    	for(Integer i : input)
    		temp += (i.intValue() - mean) * (i.intValue() - mean);
    	double variance = temp / size;
    	return Math.sqrt(variance);
    }


    // 5 points
    static void Q3(ArrayList<Integer> input){
        // Sort the input ArrayList by absolute value
    	input.sort(Comparator.comparingInt(Math::abs));
    	
    	/* or make your own sorting condition with Collections.sort
    	 * Collections.sort(input, new Comparator<Integer>() {
    	 * 		public int compare(Integer n1, Integer n2) {
    	 * 			return Integer.compare(Math.abs(n1), Math.abs(n2));
    	 * 		}
    	 * });
    	 */
    }


    // 5 points
    static int Q4(ArrayList<Integer> input, int k){
        // return the kth largest value in the input ArrayList ignoring duplicate values.
        // Example: if input=[9,8,5,2,8] and k=3 the return value is 5 since the duplicate 8 is ignored
    	ArrayList<Integer> largestElements = new ArrayList<Integer>();
    	for(int i = 0; i < k; i++) {
    		int maxVal = Integer.MIN_VALUE;
    		Integer anInteger = null;
    		for(Integer integer : input) {
    			if(!largestElements.contains(integer) && integer.intValue() > maxVal) {
    				maxVal = integer.intValue();
    				anInteger = integer;
    			}
    		}
    		largestElements.add(anInteger);
    	}
        return largestElements.get(largestElements.size() - 1).intValue();
    }



    public static void main(String[] args) {
    	System.out.println("---Q3---");
    	ArrayList<Integer> t1 = new ArrayList<Integer>();
    	t1.add(new Integer(-5));
    	t1.add(new Integer(3));
    	t1.add(new Integer(7));
    	System.out.println(t1);
    	Q3(t1);
    	System.out.println(t1);
    }

}
