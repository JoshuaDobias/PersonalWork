package inputExamples;

import java.util.Scanner;

public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Locker Combo?");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println("Your locker combo is "+ num1 + "-" + num2 + "-" + num3);
	}

}
