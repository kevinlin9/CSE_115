import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FilesChallengePS {



    // 2 points
    static void Q1(String inputFilename, String outputFilename) {
        // You are given a csv file (inputFilename) with all the data on a single line. Separate the
        // values by commas and write each value on a separate line in a new file (outputFilename)
    	BufferedReader br = null;
    	try {
    		Files.write(Paths.get(outputFilename), "".getBytes(), StandardOpenOption.CREATE_NEW);
    		br = new BufferedReader(new FileReader(inputFilename));
    		String line = "";
    		while((line = br.readLine()) != null) {
    			String[] values = line.split(",");
    			for(String s : values) {
    				Files.write(Paths.get(outputFilename), s.getBytes(), StandardOpenOption.APPEND);
    				Files.write(Paths.get(outputFilename), "\n".getBytes(), StandardOpenOption.APPEND);
    			}
    		}
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	try {
    		br.close();
    	} catch (IOException ie) {
    		ie.printStackTrace();
    	}
    }


    // 3 points
    static ArrayList<String> Q2(String filename) {

        // You are given a file (filename) containing a different random phrase on each line. Return an
        // ArrayList containing each phrase, but without the first word of each phrase.
        //
        // Example: If the files contains the 2 phrases "roofed crossover" and "beneficiary charles frederick worth" the
        // ArrayList should contain "crossover" and "charles frederick worth"
    	ArrayList<String> phrases = new ArrayList<String>();
    	try {
			for(String s : Files.readAllLines(Paths.get(filename))){
				String[] strings = s.split(" ");
				String value = "";
				for(int i = 1; i < strings.length; i++){
					value += strings[i] + " ";
				}
				phrases.add(value.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        return phrases;
    }


    // 5 points
    static double Q3(String stockFilename, String date) {

        // Given a filename with stock data in the format "date,price,volume" and a date, return the total value of all
        // shares of the stock that were traded that day. The total value is price times (multiplication) volume.

    	double totalValue = 0.0;
    	try {
			for(String s : Files.readAllLines(Paths.get(stockFilename))) {
				String[] values = s.split(",");
				if(date.equals(values[0])) {
					double price = new Double(values[1]);
					double volume = new Double(values[2]);
					totalValue += price * volume;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        return totalValue;
    }


    // 5 points
    static void Q4(String inputFilename, String outputFilename,
                                 double minLatitude, double maxLatitude,
                                 double minLongitude, double maxLongitude) {

        // Given a file of cities in the format "county code,city name,region,latitude,longitude" and a 
    	    // latitude/longitude range, write a new file containing only cities within the given range in 
    	    // both latitude and longitude.
    	try {
    		Files.write(Paths.get(outputFilename), "".getBytes(), StandardOpenOption.CREATE_NEW);
			List<String> lines = Files.readAllLines(Paths.get(inputFilename));
			for(int i = 0; i < lines.size(); i++) {
				String[] line = lines.get(i).split(",");
				double latitude = Double.parseDouble(line[3]);
				double longitude = Double.parseDouble(line[4]);
				if((latitude >= minLatitude && latitude <= maxLatitude) && (longitude >= minLongitude && longitude <= maxLongitude)) {
					Files.write(Paths.get(outputFilename), lines.get(i).getBytes(), StandardOpenOption.APPEND);
					if(i != lines.size() - 1	) {
						Files.write(Paths.get(outputFilename), ", ".getBytes(), StandardOpenOption.APPEND);
					}
				}
			}				
		} catch (IOException e) {
			e.printStackTrace();
		}
    }


    public static void main(String[] args) {
    	
    }

}
