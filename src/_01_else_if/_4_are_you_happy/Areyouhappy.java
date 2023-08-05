package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else if (answer.equals("no")) {
			answer = JOptionPane.showInputDialog("Do you want to be happy");
		}
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		} else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		System.exit(0);
	}
}

