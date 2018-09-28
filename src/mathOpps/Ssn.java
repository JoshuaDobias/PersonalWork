package mathOpps;

import java.util.Scanner;

public class Ssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is SSN (no dashes)?");
		int ssn = input.nextInt();
		System.out.println("Your age: " + age);
		int adult = 0;
		if (age < 18)
			adult = 18 - age;
		System.out.println("Years till 18: " + adult);
		System.out.println("Your SSN: " + ssn);
		int sn = ssn % 10000;
		System.out.println("Last 4 digits of SSN: " + sn);
		input.close();
	}

}
