package gameframe;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameFrame extends JFrame {
	private static final long serialVersionUID = 8438250875755724879L;
	JButton guess = new JButton("Guess");
	JButton save = new JButton("Save");
	
	private detailsPanel panel;
	
	public GameFrame(String title){
		super(title);
		setLayout(new FlowLayout());
		setVisible(true);
		setLocation(420, 200);
		setSize(500, 210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(guess);
		c.add(save);
	}
	
	public static void main(String ... args){
		GameFrame g = new GameFrame("Aim for the Stars");
		
	}

}
