package _03_remainder._2_bullseye.bullseye;

public class Bottles {
	public static void main(String[] args) {
		int i = 99;
		while (i != 1) {
			if (i>1) {
				System.out.println(i+ " bottles of beer on the wall");
				System.out.println(i+ " bottles of beer!");
				System.out.println("Take one down, pass it around");
				System.out.println(i - 1 +" bottles of beer on the wall!");
				i -= 1;
			}
		if (i==1) {
			System.out.println("No bottles of beer on the wall!");
			System.out.println("No bottles of beer!");
			System.out.println("Go to the store and buy some more");
			System.out.println("99 bottles of beer on the wall!");
		}


		}
	}
}
