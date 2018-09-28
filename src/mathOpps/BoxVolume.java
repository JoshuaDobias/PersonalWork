package mathOpps;

import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height, length, and depth (to the nerest whole number) of a box in inches");
		int height = input.nextInt();
		int length = input.nextInt();
		int depth = input.nextInt();
		int Volume = height * length * depth;
		System.out.println("This boxes volume is " + Volume + " in^3");
	}

}
