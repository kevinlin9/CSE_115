import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PS11_GUI{

    // In this problem set you build a GUI for a number guessing game. The user will attempt to guess a hidden
    // number within a known range while the GUI tells them if the hidden number is higher or lower than their
    // guess. When the user guesses the number, the number of guesses made is displayed.


    // Do not change these member variable declarations. You will use these variables in the following methods
    protected JComboBox<Integer> dropDown;
    protected JLabel display;
    protected JTextField inputText;
    protected int hiddenNumber;
    protected int numberOfGuesses;


    public JPanel centerPanel(){
        // Q1: set the member variable named display to a new JLabel displaying the String "Click start to begin"
        // Q2: return a new panel containing the JLabel member variable named display
    	display = new JLabel("Click start to begin");
        JPanel centerPanel = new JPanel();
    	centerPanel.add(display);
    	return centerPanel;		
    }


    public JPanel westPanel(){
        // Q3: set the member variable named dropDown to a new JComboBox with the choices 50, 100, and 200 in that order
        // Q4: return a new panel containing the JComboBox member variable named dropDown
    	dropDown = new JComboBox<>();
    	dropDown.addItem(new Integer(50));
    	dropDown.addItem(new Integer(100));
    	dropDown.addItem(new Integer(200));
    	JPanel westPanel = new JPanel();
    	westPanel.add(dropDown);
        return westPanel;
    }


    public JPanel southPanel(){
        // Q5: return a new panel containing a JButton with the text "Start"
        // Q6: add an action listener to the JButton
        // Q7: when the button is pressed, read the combo box named dropDown and set the int named hiddenNumber to a
        //     random number between 1 and the value from dropDown (you can call the provided randomNumber(int) to
        //     obtain a random value).
        // Q8: when the button is pressed, set the display text to "I'm thinking of a number from 1 to 100" except
        //     replace 100 with the value selected by dropDown
        // Q9: when the button is pressed, set numberOfGuesses to 0
    	JPanel southPanel = new JPanel();
    	JButton start = new JButton("Start");
    	start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedNumber = dropDown.getItemAt(dropDown.getSelectedIndex()).intValue();
				hiddenNumber = randomNumber(selectedNumber);
				display.setText("I'm thinking of a number from 1 to " + selectedNumber);
				numberOfGuesses = 0;
			}
		});
    	southPanel.add(start);
        return southPanel;
    }




    public JPanel eastPanel(){
        // Q10: set the member variable named inputText to a new JTextField and return a new panel containing
        //      inputText. This text field will be used by the user to enter their guesses
        // Q11: add a JButton with the text "Submit" for the user to submit their guesses. This button must
        //      have an ActionListener that will call your makeGuess() method.
        // Q12: add a KeyListener to your JTextField that will let the user submit a guess by hitting enter instead
        //      of clicking the submit button. You should only use the keyPressed event while leaving keyTyped and
        //      keyReleased empty. The keyPressed event should check if the key pressed was the enter key and if it
        //      was, call your makeGuess() method.
    	
    	JPanel eastPanel = new JPanel();
    	inputText = new JTextField();
    	KeyListener enterAGuess = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					makeGuess();					
				}
			}
		};
		inputText.addKeyListener(enterAGuess);
		eastPanel.add(inputText);
		
		JButton submit = new JButton("Submit");
		ActionListener submitAGuess = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				makeGuess();
			}
		};
    	submit.addActionListener(submitAGuess);
    	eastPanel.add(submit);
    	
        return eastPanel;
    }



    public void makeGuess(){
        // Q13: increment number of guesses using the appropriate member variable
        // Q14: if the hiddenNumber is greater than the value in inputText, set the display text to "Higher" and
        //      if the hiddenNumber is less than the value in inputText, set the display text to "Lower"
        // Q15: if the hiddenNumber is equal to the value in inputText, set the display text
        //      to "You guessed the number 23 in 7 guesses" except replace 23 and 7 with the values of the
        //      hidden number and number of guesses
    	numberOfGuesses += 1;
    	if(hiddenNumber > Integer.parseInt(inputText.getText())) {
    		display.setText("Higher");
    	}
    	else if(hiddenNumber < Integer.parseInt(inputText.getText())) {
    		display.setText("Lower");
    	}
    	else {
    		display.setText("You guessed the number " + hiddenNumber + " in " + numberOfGuesses + " guesses");
    	}
    }



    /*** Do not change any code below this point ***/


    /**
     * returns a random number from 1 to maxNumber. You can call this method to generate random numbers
     */
    private int randomNumber(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber) + 1;
    }

    /**
     * Adds all the panels to a JFrame
     */
    public static void startGUI(){
        PS11_GUI guiElements = new PS11_GUI();

        JFrame frame = new JFrame("Guess The Number");
        frame.setSize(600,100);
        frame.getContentPane().add(guiElements.centerPanel(), BorderLayout.CENTER);
        frame.getContentPane().add(guiElements.southPanel(), BorderLayout.SOUTH);
        frame.getContentPane().add(guiElements.westPanel(), BorderLayout.WEST);
        frame.getContentPane().add(guiElements.eastPanel(), BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
