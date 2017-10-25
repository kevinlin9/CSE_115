package code.GUIApp;

import java.awt.Window;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements Runnable {
	
	private JFrame window;
	private JLabel label;
	private Model m;
	
	@Override
	public void run() {
		window = new JFrame("Data Model GUI");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.X_AXIS));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		m = new Model();
		
		mainPanel.add(labelPanel);
		label = new JLabel("SOME TEXT");
		labelPanel.add(label);
		mainPanel.add(buttonPanel);
		JButton b1 = new JButton("+1");
		JButton b2 = new JButton("-1");
		buttonPanel.add(b1);
		ActionListener x = new AddButtonHandler(m, this);
		b1.addActionListener(x);
		buttonPanel.add(b2);
		ActionListener y = new AddButtonHandler(m, this);
		b2.addActionListener(y);
		
				
		window.add(mainPanel);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}
	
	public void updateDisplay() {
		int currentValue = m.getValue();
		label.setText("The current value in the Model object is: " + currentValue);
		window.pack();
	}
}
