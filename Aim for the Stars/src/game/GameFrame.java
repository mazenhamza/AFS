package game;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame {
	
	JLabel label = new JLabel();
	public void createFrame(){
	
	JFrame gameFrame = new JFrame();
	gameFrame.setSize(505, 505);
	gameFrame.setVisible(true);
	label.setText("hello");
	gameFrame.add(label);
	
	}

}
