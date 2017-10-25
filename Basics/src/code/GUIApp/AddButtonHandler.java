package code.GUIApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonHandler implements ActionListener{
	
	private Model myModel;
	private GUI myGUI;
	
	public AddButtonHandler(Model model, GUI gui) {
		myModel = model;
		myGUI = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		myModel.increment();
		myGUI.updateDisplay();
	}
}
