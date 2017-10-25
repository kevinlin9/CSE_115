package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerA implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hi");
	}
}
