package decisions;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter activity number");
		int activity = input.nextInt();
		switch (activity) {
		case 3:
			int divisors = 0;
			int q = 0;
			int biggestNum = 0;
			System.out.println("enter number range you would like to find with the highest divisor from 1-inputed");
			int numMax = input.nextInt();
			for (int number13 = 1; number13 <= numMax; number13++) {
				System.out.println("number: " + number13);
				for (int divide = 1; divide < number13; divide++) {

					if (number13 % divide == 0) {
						divisors++;
					}

				}
				divisors -= 1;
				if (divisors > q) {
					q = divisors;
					biggestNum = number13;
				}
				System.out.println("there are " + divisors + " devisors in that number");
				divisors = 0;
			}
			System.out.println("The number with the most devisors " + biggestNum);
			break;
		case 4:
			for (int column = 1; column <= 5; column++) {
				for (int row = column; row <= 6; row++) {
					if (row == 6) {
						System.out.print(" " + column + " ");
					} else {
						System.out.print(" " + row + " ");
					}

				}
				System.out.println();

			}
			break;
		case 5:
			// prime factorization
			System.out.println("Enter a number to go through prime factorization");
			int num = input.nextInt();
			int remainder = 0;
			for (int factor = 2; factor <= num; factor++) {
				while (remainder == 0) {
					remainder = num % factor;
					if (remainder == 0) {
						num = num / factor;
						System.out.println(factor);
					}
				}
				remainder = 0;
			}
			break;
		case 6:
			int number = 0;
			int factor6 = 1;
			int overall = 0;
			int remainder6 = 0;
			for (factor6 = 1; factor6 <= 1000; factor6++) {
				for (number = 1; number < factor6; number++) {
					remainder6 = factor6 % number;
					if (remainder6 == 0) {
						overall += number;
					}
				}
				if (overall == factor6) {
					System.out.println(factor6 + " is a perfect number");
				}
				overall = 0;

			}
			break;
		case 7:
			int choice = 1;
			while (choice <= 6) {
				System.out.println("Please select function: ");
				System.out.println();
				System.out.println("1-Right Triangle Test");
				System.out.println("2-powers");
				System.out.println("3-Square Root");
				System.out.println("4-Round up");
				System.out.println("5-round down");
				System.out.println("6-Quit Calc program");
				choice = input.nextInt();
				if (choice > 6 || choice <= 0) {
					System.out.println();
					System.out.println("That isn't a function, please select valid Number");
					choice = 0;
				}
				while (choice != 0 && choice <= 6) {
					if (choice == 1) {
						System.out.println("Right Triangle program");
						System.out.println();
						System.out.println("Enter length of one leg");
						double leg1 = input.nextInt();
						System.out.println("Enter length of other leg");
						double leg2 = input.nextInt();
						System.out.println("Enter Hypotenus");
						double hyp = input.nextInt();
						double sides = Math.pow(leg1, 2) + Math.pow(leg2, 2);
						double c = Math.pow(hyp, 2);
						if (sides == c) {
							System.out.println("Triange is a right triangle");
						} else {
							System.out.println("Not a right Triangle");
						}
						System.out.println();
						break;
					}
					if (choice == 2) {
						System.out.println("Powers");
						System.out.println("Enter a Number");
						double number7 = input.nextDouble();
						System.out.println("Enter a Power");
						double power = input.nextDouble();
						double solution = Math.pow(number7, power);
						System.out.println("Result: " + solution);
						break;
					}
					if (choice == 3) {
						System.out.println("Square roots");
						System.out.println("Enter a Number");
						double number7 = input.nextDouble();
						double square = Math.sqrt(number7);
						System.out.println("Result: " + square);
						break;
					}
					if (choice == 4) {
						System.out.println("Round up");
						System.out.println("Enter a Number");
						double number7 = input.nextDouble();
						double round = Math.ceil(number7);
						System.out.println("Result: " + round);
						break;
					}
					if (choice == 5) {
						System.out.println("Round down");
						System.out.println("Enter a Number");
						double number7 = input.nextDouble();
						double round = Math.floor(number7);
						System.out.println("Result: " + round);
						break;
					}
					if (choice == 6) {
						System.out.println("Quitting");
						choice = 7;
					}
				}
			}
			System.out.println("Ending Program");
			break;

		}
	}
}
