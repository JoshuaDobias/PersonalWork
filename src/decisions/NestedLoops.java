package decisions;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter activity number");
		int activity = input.nextInt();
		switch (activity) {
		case 3:
			int divisors=0;
			int q=0;
			int	biggestNum=0;
			System.out.println("enter number range you would like to find with the highest divisor from 1-inputed");
			int numMax=input.nextInt();
			for (int number13=1; number13<=numMax;number13++) {
				System.out.println("number: "+number13);
				for (int divide=1; divide<number13;divide++) {
					
					if (number13%divide==0) {
						divisors++;
					}
					
				}divisors-=1;
				if (divisors>q) {
						q=divisors;
						biggestNum=number13;
					}
				System.out.println("there are "+ divisors + " devisors in that number");
				divisors=0;
				}System.out.println("The number with the most devisors " + biggestNum);
				break;
		case 4:
			
			for (int column = 1; column <= 5; column++) {
				
				
				for (int row = column; row <= 6; row++) {
					if (row==6) {
						System.out.print(" "+column+" ");}
					else {
					System.out.print(" "+row+ " ");
					}

				}System.out.println();
				
				
			}
			
			
			
		}
	}

}
