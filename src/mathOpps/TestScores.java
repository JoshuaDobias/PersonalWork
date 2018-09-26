package mathOpps;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the intager score of your 3 tests");
		System.out.println("Test 1 ");
		int test1 = input.nextInt();
		System.out.println("Test 2");
		int test2 = input.nextInt();
		System.out.println("Test 3");
		int test3 = input.nextInt();
		System.out.println("Test 1: " + test1 + "   Test 2: " + test2 + "   Test 3: " + test3);
		double average = ((double)test1 + (double)test2 + (double)test3)/3.0;
		System.out.println("Test Average " + average);
	}
}
