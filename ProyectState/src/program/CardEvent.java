package program;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardEvent extends JLabel{
	
	
	public CardEvent(String event, ImageIcon i) {
		
		this.setText(event);
		this.setIcon(i);
	}

	

	

}
