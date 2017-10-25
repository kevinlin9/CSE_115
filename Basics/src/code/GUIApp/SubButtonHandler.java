package code.GUIApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubButtonHandler implements ActionListener{
	
	private Model myModel;
	private GUI myGUI;
	
	public SubButtonHandler(Model model, GUI gui) {
		myModel = model;
		myGUI = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		myModel.decrement();
		myGUI.updateDisplay();
	}
}
