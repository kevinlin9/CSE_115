package code;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI_Demo {
	public static void main(String[] args) {
		String title = "This is a JFrame window";
		JFrame mainWindow = new JFrame(title);
		/*int width = 1440;
		int height = 700;
		mainWindow.setSize(width, height);*/
		String text = "This is a label with a whole bunch of text on it. The quick brown fox jumped over the big blue wall.";
		JLabel label = new JLabel(text);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel mainPanel = new JPanel();
		mainWindow.add(mainPanel);
		mainPanel.setLayout(new FlowLayout());
		for(int i = 0; i < 20; i++) {
			JLabel l = new JLabel("Label #" + i);
			mainPanel.add(l);
		}
		mainPanel.add(label);
		JButton button = new JButton("Clickable button");
		mainPanel.add(button);
		
		mainWindow.pack();
		mainWindow.setVisible(true);
	}
}
