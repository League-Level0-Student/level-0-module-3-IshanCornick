
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int random = new Random().nextInt(101);
		int tries;
		tries =0;
		while (tries < 11) {
			String gues = JOptionPane.showInputDialog("What is your guess?");
			int guess = Integer.parseInt(gues);
			if (guess > random && guess < 101 && guess > 0) {
				JOptionPane.showMessageDialog(null, "Guess to high");
				tries +=1;
			}
			else if (guess < random && guess < 101 && guess > 0) {
				JOptionPane.showMessageDialog(null, "Guess to low");
				tries +=1;
			} 
			else if (guess == random && guess < 101 && guess > 0){
				JOptionPane.showMessageDialog(null, "Correct");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "Range is 1 to 100 inclusive");
			}
		}
		
	}

}


