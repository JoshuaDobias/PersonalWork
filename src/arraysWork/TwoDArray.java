package arraysWork;

import java.util.Random;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Activity:");
		int activity = input.nextInt();
		int min = 0;
		int max = 100;
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
			break;
		case 3:
			int total1 = 0;
			int[][][] don = new int[3][7][9];
			for (int row = 0; row < don.length; row++) {
				for (int column = 0; column < don[0].length; column++) {
					for (int t = 0; t < don[0][0].length; t++) {
						int randomNumber3 = min + generator.nextInt(max - min + 1);
						don[row][column][t] = randomNumber3;
						total1 += randomNumber3;
					}
				}
			}
			System.out.println(total1);
			break;
		case 4:
			input.nextLine();
			String[][] names = new String[4][3];
			for (int row = 0; row < names.length; row++) {
				for (int column = 0; column < names[0].length; column++) {
					names[row][column] = new String();
					System.out.println("name");
					String name = input.nextLine();
					names[row][column] = name;
				}
			}
			System.out.println("Here are the names");
			for (int i = 0; i < names.length; i++) {
				for (int column = 0; column < names[0].length; column++) {
					System.out.print(names[i][column] + " ");
				}
				System.out.println();
			}
			break;
		case 5:
			Friend[][] friends = new Friend[18][5];
			for (int row = 0; row < friends.length; row++) {
				for (int column = 0; column < friends[0].length; column++) {
					friends[row][column] = new Friend();
					int randomNumber = min + generator.nextInt(max - min + 1);
					friends[row][column].setAge(randomNumber);
					System.out.print("Friend #: " + (row + column + 1 + (4 * row)) + " Age: "
							+ friends[row][column].getAge() + " ");
				}
				System.out.println();
			}
		}
	}
}
