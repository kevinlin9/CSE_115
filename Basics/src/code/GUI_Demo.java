package code;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUI_Demo {
	public static void main(String[] args) {
		String title = "This is a JFrame window";
		JFrame mainWindow = new JFrame(title);
		mainWindow.setVisible(true);
		int width = 1440;
		int height = 700;
		mainWindow.setSize(width, height);
		String text = "This is a label with a whole bunch of text on it. The quick brown fox jumped over the big blue wall.";
		JLabel label = new JLabel(text);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		mainWindow.add(label);
	}
}
