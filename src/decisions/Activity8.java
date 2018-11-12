package decisions;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num=0;
		double num2=0;
		int quit=1;
		while (quit==1) {
			num=input.nextDouble();
			if (num>num2) {num2=num;
					}
			else {
			System.out.println("Do you want to quit 0=yes/1=contine");
			quit=input.nextInt();
		}}
		System.out.println(num2);
	}

}
