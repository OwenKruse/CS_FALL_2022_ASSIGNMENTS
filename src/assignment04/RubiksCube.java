package assignment04;

import javax.swing.JFrame;

public class RubiksCube {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rubiks Cube");
		frame.setSize(800,800);
		RubiksPanel panel = new RubiksPanel();
		frame.add(panel);
		frame.setVisible(true);
	}

}
