package mathOpps;

import java.util.Scanner;

public class TakeTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the distance of this trip in miles to the cloest whole number?");
		int distance = input.nextInt();
		System.out.println("How many MPG does your car get?");
		int mpg = input.nextInt();
		System.out.println("What is the total amount of money you spent on gas?");
		int money = input.nextInt();
		System.out.println("You taveled " + distance + " miles");
		int gused = distance / mpg;
		System.out.println("You used " + gused + " gallons of gas");
		System.out.println("You spent $" + money + " on gas");
		double average = (double) money / (double) gused;
		System.out.println("Averager price of gas $" + average + " per mile");
		input.close();

	}

}