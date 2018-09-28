package mathOpps;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money = input.nextDouble();
		int nmoney = (int) (money * 100);
		int doller = (nmoney) / 100;
		int rdoller = (nmoney) % 100;
		int quorter = (rdoller) / 25;
		int rquorter = (rdoller) % 25;
		int dime = (rquorter) / 10;
		int rdime = (rquorter) % 10;
		int nickel = (rdime) / 5;
		int rnickel = (rdime) % 5;
		int penny = (rnickel) / 1;
		System.out.println("Dollers: " + doller);
		System.out.println("Quorters: " + quorter);
		System.out.println("Dimes: " + dime);
		System.out.println("Nickels: " + nickel);
		System.out.println("Pennies: " + penny);

	}

}
