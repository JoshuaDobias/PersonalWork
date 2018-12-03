package arraysWork;

import java.util.Random;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Activity:");
		int activity = input.nextInt();
		int min = 1;
		int max = 1;
		switch (activity) {
		case 1:

			int[][] ran = new int[14][9];
			for (int row = 0; row < ran.length; row++) {
				for (int column = 0; column < ran[0].length; column++) {
					int randomNumber = min + generator.nextInt(max - min + 1);
					ran[row][column] = randomNumber;
					System.out.print(ran[row][column] + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			int[][] case2 = new int[7][3];
			int total = 0;
			for (int row = 0; row < case2.length; row++) {
				for (int column = 0; column < case2[0].length; column++) {
					int randomNumber = min + generator.nextInt(max - min + 1);
					case2[row][column] = randomNumber;
					total += randomNumber;
				}
				System.out.println(total);
				total = 0;

			}
		}
	}
}
