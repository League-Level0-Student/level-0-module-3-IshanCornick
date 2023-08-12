package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class story {
	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("You walk up in a goblin cave, Do you talking with them or attack them? Enter talk or attack.");
			if (answer1.equals("attack")) {
				JOptionPane.showMessageDialog(null, "You die");
				System.exit(0);
			}
			if (answer1.equals("talk")) {
				JOptionPane.showMessageDialog(null, "You escpae");
				answer1 = JOptionPane.showInputDialog("Do you run away or go back and try to rob them? Enter rob or run.");
			}
			if (answer1.equals("rob")) {
				JOptionPane.showMessageDialog(null, "They kill you.");
			}
			if (answer1.equals("run")) {
				JOptionPane.showMessageDialog(null, "You run away and live peacefully.");
			}
			
	}
}
