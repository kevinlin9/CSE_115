import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class PS5_Files {




    static ArrayList<String> Q1(String filename){
        // Return all lines of the file in an ArrayList with 1 String for each line in the file
    	ArrayList<String> strings = new ArrayList<String>();
    	try {
			for(String s : Files.readAllLines(Paths.get(filename)))
				strings.add(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
        return strings;
    }


    static int Q2(String filename){
        // return the number of lines in the input file
    	
        return Q1(filename).size();
    }


    static double Q3(String number){
        // Return the double represented by the input String. You can assume the String contains a well-formed double.
    	
        return new Double(number);
    }


    static int Q4(String filename, char letter){
        // return the number of times letter appears in the input file
    	int numAppears = 0;
    	ArrayList<String> strings = Q1(filename);
    	for(String s : strings)
    		for(int i = 0; i < s.length(); i++) {
    			if(s.charAt(i) == letter) {
    				numAppears++;
    			}    				
    		}
    			
        return numAppears;
    }


    static boolean Q5(String filename){
    	try {
    		Files.readAllLines(Paths.get(filename));
    	} catch (IOException e){
    		e.printStackTrace();
    		return false;
    	}
        return true;
    }


    static String Q6(String line){
        // Given a line containing comma-separated values, return the second value.
    	
        return line.split(",")[1];
    }


    static int Q7(String line){
        // Given a line containing comma-separated values, return the second value as an int. You can assume the second
        // value is a well-formed integer.

        return new Integer(Q6(line));
    }


    static ArrayList<Integer> Q8(String filename){
        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain a well-formed integer.
    	ArrayList<Integer> i = new ArrayList<Integer>();
    	try {
			for(String s : Files.readAllLines(Paths.get(filename)))
				i.add(new Integer(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
        return i;
    }


    static ArrayList<String> Q9(String line){
        // Given a line containing comma-separated values, return an ArrayList of Strings containing each value in the
        // line separately. Example: Given "comma,separated,values" return ["comma","separated","values"] as 3 entries
        // in an ArrayList.
    	
        return (ArrayList<String>) Arrays.asList(line.split(","));
    }


    static HashMap<String, Integer> Q10(String filename){
        // Read the input file and add an entry into a HashMap for each line. The lines will contain comma separated
        // values with a String then an int (ex: "text,5"). For each line enter the String as the key and the int as
        // a value into the map and return the map.
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	List<String> lines = new ArrayList<String>();
    	try {
			lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	for(String s : lines) {
    		String[] splited = s.split(",");
    		map.put(splited[0], new Integer(splited[1]));
    	}
        return map;
    }


    static ArrayList<String> Q11(String filename){
        // Read the file to populate an ArrayList of Strings and return the ArrayList. The file will be comma separated
        // and only the 2nd value (index 1) is to be added into the ArrayList
    	ArrayList<String> results = new ArrayList<String>();
    	List<String> lines = new ArrayList<String>();
    	try {
			lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	for(String s : lines) {
    		String[] splited = s.split(",");
    		results.add(splited[1]);
    	}
        return results;
    }


    static ArrayList<Integer> Q12(String filename){
        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain comma separated data and only the 3rd value (index 2) is to be added into the ArrayList as Integers.
        // You can assume the 3rd value on each line is a well-formed Integer.
    	ArrayList<Integer> results = new ArrayList<Integer>();
    	List<String> lines = new ArrayList<String>();
    	try {
			lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	for(String s : lines) {
    		String[] splited = s.split(",");
    		results.add(new Integer(splited[2]));
    	}
        return results;
    }


    static void Q13(String filename, String data){
        // create a new file named filename and write the contents of data into it
    	
    }


    static void Q14(String filename, String data){
        // append the contents of data to the end of filename. You can assume a file named filename already exists

    }


    static void Q15(String inputFilename, String outputFilename){
        // read every line in inputFilename and write it to a file named outputFilename (make a copy of the file)

    }



    public static void main(String[] args) {
        // sample usage
        System.out.println(Q1("data/test0.txt"));
    }

}
