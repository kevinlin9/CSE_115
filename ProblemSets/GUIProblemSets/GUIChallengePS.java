import com.eclipsesource.json.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileReader;

public class GUIChallengePS{


    public JComboBox<Planet> getComboBox(){
        // Q1 (7 points): return a combo box containing the planets from "planets.json". All the information from the
        //                file must be included in the combo box items in the same order as they appear in the file.
        //
        // Hint: Json.parse can take a FileReader as an argument to read JSON from a file
    	JComboBox<Planet> planetBox = new JComboBox<Planet>();
    	try {
    		FileReader fr = new FileReader("planets.json");
    		JsonValue jValue = Json.parse(fr);
    		JsonArray jArray = jValue.asArray();
    		for(JsonValue jv : jArray) {
    			JsonObject jsonObject = jv.asObject();
    			String name = jsonObject.getString("name", null);
    			String imageFilename = jsonObject.getString("image", null);
    			int diameter = jsonObject.getInt("diameter", 0);
    			double orbitalPeriod = jsonObject.getDouble("orbital period", 0.0);
    			Planet planet = new Planet(name, imageFilename, diameter, orbitalPeriod);
    			planetBox.addItem(planet);    			
    		}
    		fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
        return planetBox;
    }



    public JPanel getPanel(){
        // Q2 (8 point): return a panel containing your combo box from Q1, a button, and any number of labels
        //               such that when the button is clicked all the information (image, diameter, and orbital period)
        //               are displayed on the labels any way you choose
        //               (partial credit may be awarded if only some of the information is displayed)

    	JPanel jPanel = new JPanel();
    	JComboBox<Planet> planetBox = getComboBox();
    	JLabel images = new JLabel("Images");
    	JLabel diameters = new JLabel("Diameters");
    	JLabel orbitalPeriods = new JLabel("Orbital Periods");
    	JButton jButton = new JButton("Display Information");
    	
    	
    	
        return jPanel;
    }



    /*** You may change any code below this line ***/

    public static void startGUI(){
        GUIChallengePS instance = new GUIChallengePS();

        // create a new window
        JFrame frame = new JFrame("Solar System");

        // set the size of the window
        frame.setSize(650,250);

        // add your frame to the left side of the window
        frame.getContentPane().add(instance.getPanel(), BorderLayout.WEST);

        // ends the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // displays the window
        frame.setVisible(true);
    }


    public static void main(String[] args){
    	SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                startGUI();
            }
        });
    }


}
