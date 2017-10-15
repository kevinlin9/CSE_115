public class ControlFlowChallengePS {



    // 2 points
    static boolean Q1(int number) {

        // TODO: Return true if number is a perfect cube, false otherwise. You can assume the value
        //       of number is between 1 and 1000000
        //
        // Note: a perfect cube is a number whose cube root is an integer
    	double root = Math.cbrt(number);
    	boolean perfect = false;
    	int loop = (int)Math.round(root);
    	for(int i = 0; i < loop; i++)
    		root -= 1.0;
    	if(root == 0.0)
    		perfect = true;
    	return perfect;
    }



    // 3 points
    static void Q2(int n) {
        // TODO: print all the perfect squares less than or equal to n
        //
        // Example: If n is 25 print "1 4 9 16 25"
        // (you can print the numbers on separate lines or on the same line)
    	boolean go = true;
    	for(int i = 1; go && i <= n; i++){
    		int sq = i * i;
    		if(sq <= n)
    			System.out.println(sq);
    		else
    			go = false;
    	}

    }



    // 5 points
    static String Q3(int a, int b, int c, double lowerBound, double targetValue, double upperBound) {

        // TODO: If the average of a, b, and c is less than lower bound, return "too low".
        //       If the average of a, b, and c is greater than upper bound, return "too high".
        //       If the average of a, b, and c is within 2.5 of the target value, return "just right".
        //       If the average of a, b, and c is between the upper and lower bounds,
        //          but not within 2.5 of the target value, return "almost".
        //
        // Note: Be careful to avoid integer division when computing the average
        //       Integer division explained - https://www.youtube.com/watch?v=ql3G1ZSe098

    	double avg = (a + b + c) / 3.0;
    	if(avg < lowerBound)
    		return "too low";
    	else if(avg > upperBound)
    		return "too high";
    	else if(Math.abs(avg - targetValue) <= 2.5)
    		return "just right";
        return "almost";
    }



    // 5 points
    static void Q4(int n) {
        // TODO: print all the prime numbers less than or equal to n
        // Example: If n is 25 print "2 3 5 7 11 13 17 19 23"
        // (you can print the numbers on separate lines or on the same line)
    	if(2 < n)
    		System.out.println(2);
    	int root = (int)Math.ceil(Math.pow(n, .5));
    	boolean isPrime = true;
    	for(int i = 3; i <= n; i++){
    		isPrime = true;
    		for(int j = 2; j <= root; j++){
    			if(i % j == 0 && i != j)
    				isPrime = false;
    		}
    		if(isPrime)
    			System.out.println(i);
    	}
    }



    public static void main(String[] args) {

        // You can optionally use this main method to test your code without having to submit.
        // This main method will not be graded
    	System.out.println("---Q1---");
    	System.out.println(Q1(8));
    	System.out.println(Q1(9));
    	System.out.println("---Q2---");
    	Q2(100);
    	System.out.println("---Q4---");
    	Q4(100);
    }

}
