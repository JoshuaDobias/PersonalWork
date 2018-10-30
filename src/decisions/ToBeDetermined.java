package decisions;

import java.util.Scanner;

public class ToBeDetermined {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter activity number");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			int num1;
			do {
				System.out.println("Enter an integer");
				num1 = input.nextInt();
				int product = num1 * 17;
				System.out.println(product);
			} while (num1 != 9999);
			break;
		case 3:
			System.out.println("Please enter a number");
			int num3 = input.nextInt();
			int largeNum3 = 0;
			int smallNum3 = 0;
			do {
				if (num3 > largeNum3) {
					largeNum3 = num3;
				}
				if (num3 > smallNum3 && smallNum3 < largeNum3) {
					smallNum3 = num3;
				}
				System.out.println("Enter a number or 9999 to quit");
				num3 = input.nextInt();
			} while (num3 != 9999);
			int range = largeNum3 - smallNum3;
			System.out.println("This is your range " + range);
			break;
		case 5:
			for (int i = 0; i < 20; i++) {
				System.out.println(i + "hello world");
				break;
			}
		case 6:
			int total = 0;
			for (int counter = 1; counter <= 10; counter++) {
				total += counter;
				break;
			}
			System.out.println(total);
		case 9:
			int give = 0;
			int total9 = 0;
			for (int count = 0; count < 5; count++) {
				System.out.println("Enter a number");
				give = input.nextInt();
				total9 = total9 + give;
			}
			System.out.println("Your total is " + total9);
			break;
		case 10:
			// this is the Prime Numbers activities
			System.out.println("Enter a number: ");
			int checkNum = input.nextInt();
			int remainder = 1;
			for (int i = 2; i != checkNum && remainder != 0; i++) {
				remainder = checkNum % i;
				System.out.println(checkNum + " Divided by " + i + " gives a remainder " + remainder);
			}
			if (remainder == 0) {
				System.out.println("The number you entered is not prime");
			} else {
				System.out.println("The number you entered is Prime");
			}
			break;
		case 11:
			
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					System.out.print(" "+i*j+ " ");
					

				}System.out.println();
			}
			break;
		case 12:
			for (int j = 0; j<=3; j++) {
			for (int i = 1; i <= 5; i++) {
				if (i!=3)
				System.out.print(i);
				if (i==3) {
					i=i-2+j;
				System.out.print(i);
				i=i+2-j;}
				
			}
			System.out.println();}
			break;
		case 13:
			int Divisors=0;
			int q=0;
			int	biggestNum=0;
			for (int number13=1; number13<=1000;number13++) {
				System.out.println("number: "+number13);
				for (int divide=1; divide<number13;divide++) {
					
					if (number13%divide==0) {
						Divisors++;
					}
					
				}if (Divisors>q) {
						q=Divisors;
						biggestNum=number13;
					}
				System.out.println("there are "+ Divisors + " devisors in that number");
				Divisors=0;
				}System.out.println("The number with the most devisors " + biggestNum);
			
		
		
		
		
		
		
		}
		
		}
	}

