package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class Years {
	public static void main(String[] args) {
	String year = JOptionPane.showInputDialog("How old are you?");
	int years= Integer.parseInt(year);
	int alive = 2023 - years;
	while (alive<2024) {
		System.out.println(alive);
		alive +=1;
	}
	}
}
