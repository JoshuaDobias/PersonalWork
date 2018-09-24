package mathOpps;

import java.util.Scanner;

public class LongDivison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pick two interger numbers to long devide.");
		System.out.print("number 1 ");
		int num1 = input.nextInt();
		System.out.print("Number 2");
		int num2 = input.nextInt();
		int dividend = num1 / num2;
		int divisor = num1 % num2;
		System.out.println("Dividend Equals " + dividend);
		System.out.println("remainder " + divisor);
	}
}
