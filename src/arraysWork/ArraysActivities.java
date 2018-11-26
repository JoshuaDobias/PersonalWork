package arraysWork;

import java.util.Random;
import java.util.Scanner;

public class ArraysActivities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("activity");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			int j = 1;
			int[] scores = new int[5];

			System.out.println("input your scores");
			for (int i = 0; i < 5; i++) {
				j++;
				System.out.println("test score: " + j);
				scores[i] = input.nextInt();
			}
			break;
		case 2:
			int j1 = 0;
			int[] scores1 = new int[5];
			int sum = 0;
			System.out.println("input your scores");
			for (int i = 0; i < 5; i++) {
				j1++;
				System.out.println("test score: " + j1);
				scores1[i] = input.nextInt();
			}
			for (int i = 0; i < 5; i++) {
				sum = sum + scores1[i];
			}
			System.out.println(sum);
			break;
		case 3:
			int j2 = 0;
			int[] scores2 = new int[25000];
			double sum1 = 0;
			System.out.println("input your scores");
			for (int i = 0; i < 25000; i++) {
				j2++;
				System.out.println("test score: " + j2);
				scores2[i] = input.nextInt();
			}
			for (int i = 0; i < 25000; i++) {
				sum1 = sum1 + scores2[i];
			}
			System.out.println(sum1);
			break;
		case 4:
			int j3 = 0;
			int[] scores3 = new int[25000];
			System.out.println("input your scores");
			for (int i = 0; i < 25000; i++) {
				j3++;
				System.out.println("test score: " + j3);
				scores3[i] = input.nextInt();
			}
			for (int i = 25000 - 1; i >= 0; i--) {
				System.out.println(scores3[i]);
			}
			break;
		case 5:
			Random generater = new Random();
			int randomNum;
			int large = 0;
			int[] testScore = new int[250];
			for (int i = 0; i < 250; i++) {
				randomNum = 0 + generater.nextInt(100 - 0 + 1);
				System.out.println(randomNum);
				testScore[i] = randomNum;
				if (testScore[i] > large) {
					large = testScore[i];
				}
			}
			System.out.println(large);
		}

	}
}
