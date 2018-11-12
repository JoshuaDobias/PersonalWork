package rN;

import java.util.Random;
import java.util.Scanner;

public class ProgammingOp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generater = new Random();
		System.out.println("Select activity");
		int activity = input.nextInt();
		switch (activity) {
		case 1:// roll a dice
			int min = 1;
			System.out.println("How many sides does the dice have");
			int sides = input.nextInt();
			System.out.println("How many times do you want to roll this dice");
			int numberOfRoll = input.nextInt();
			System.out.println("Does the dice include zero? true or false");
			boolean i = input.nextBoolean();
			if (i == true)
				min = 0;
			for (int count = 1; count <= numberOfRoll; count++) {
				int randomNum = min + generater.nextInt(sides - min + 1);
				System.out.println("Number: " + randomNum);
			}
			break;
		case 2:// roll a dice v2
			int one = 0;
			int two = 0;
			int three = 0;
			int four = 0;
			int five = 0;
			int six = 0;
			System.out.println("How many times would you like to roll a 6 sided dice");
			double rolls = input.nextDouble();
			for (int count = 1; (double) count <= rolls; count++) {
				int randomNum = 1 + generater.nextInt(6 - 1 + 1);
				if (randomNum == 1) {
					one++;
				}
				if (randomNum == 2) {
					two++;
				}
				if (randomNum == 3) {
					three++;
				}
				if (randomNum == 4) {
					four++;
				}
				if (randomNum == 5) {
					five++;
				}
				if (randomNum == 6) {
					six++;
				}
			}
			System.out.println("Number of ones: " + one + " percent: " + ((100) * (double) one / rolls) + ("%"));
			System.out.println("Number of two: " + two + " percent: " + ((100) * (double) two / rolls) + ("%"));
			System.out.println("Number of three: " + three + " percent: " + ((100) * (double) three / rolls) + ("%"));
			System.out.println("Number of four: " + four + " percent: " + ((100) * (double) four / rolls) + ("%"));
			System.out.println("Number of five: " + five + " percent: " + ((100) * (double) five / rolls) + ("%"));
			System.out.println("Number of six: " + six + " percent: " + ((100) * (double) six / rolls) + ("%"));
			break;
		case 3:// flip a coin
			System.out.println("running activity 3");
			double heads = 0;
			double max=0;
			double min1=0;
			for (int count1 = 1; count1 <= 1000000; count1++) {
				for (int count2 = 1; count2 <= 100000; count2++) {
					int randomNum = 1 + generater.nextInt(2 - 1 + 1);
					if (randomNum == 1) {
						heads++;
					}
				}
				double finTotal=100*(heads/100000);
			if (finTotal>max) {
				max=finTotal;
			}
			else if (finTotal>min1 && finTotal<max) {
				min1=finTotal;
			}
			heads=0;
			}
			System.out.println("Min: "+min1+ " Max: "+ max);
			break;
		case 4://Yahtzee
		       int min4 = 1;
		       int max4 = 6;
		       int roll = 0;
		       int count = 0;
		       int tries = 0;
		       boolean yahtzee = false;
		       while (yahtzee == false) {
		           for (int h = 1; h < 5; h++) {
		        	   System.out.println(h);
		               int outcome = min4 + generater.nextInt(max4 - min4 + 1);
		               System.out.println(outcome);
		               if (roll == 0) {
		                   roll = outcome;
		                   count++;
		               } else if (outcome == roll) {
		                   count++;
		               }
		           }
		           if (count == 5) {
		               System.out.println("You got Yahtzee! It took you " + tries + " tries!");
		               yahtzee = true;
		           } else {
		               yahtzee = false;
		               tries++;                
		           }
		           count = 0;
		       }
		   }
		}
		

	}

