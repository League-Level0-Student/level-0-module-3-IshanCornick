
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot rob = new Robot();
		Robot.setWindowSize(800, 600);
		rob.hide();
		//2. Make the robot draw a shape (this will take more than one line of code)
		Random ran = new Random();
		int loop;
		loop = 1;
		while (loop > 0) {
			
			rob.setX(ran.nextInt(801));
			rob.setY(ran.nextInt(601));
			rob.turn(ran.nextInt(360));
			int count;
			count = 0;
			while (count <4) {
				rob.penDown();
				rob.setSpeed(100000);
				rob.move(25);
				rob.turn(120);
				count +=1;
			}
			//3. Set the pen width to 10
			rob.setPenWidth(10);
			//4. Ask the user what color pen they would like the robot to draw with
			String answer = JOptionPane.showInputDialog("What color do you want?");
			//5. Use an if/else statement to set the pen color that the user requested

			//6. If the user doesn't enter anything, choose a random color
			if (answer.equals("")) {
				rob.setRandomPenColor();
			} else if (answer.equals("red")) {
				rob.setPenColor(255,0,0);
			} else if (answer.equals("green")) {
				rob.setPenColor(0,255,0);
			} else if (answer.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
		}
	}}
	//7. Put a loop around your code so that you keep asking the user for more colors & drawing them


