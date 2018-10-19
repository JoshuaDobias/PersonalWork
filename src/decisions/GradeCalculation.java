package decisions;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your test average");
		double testAve=input.nextDouble();
		System.out.println("What is your Homework average");
		double homeAve=input.nextDouble();
		System.out.println("Is your teacher nice? true or false");
		boolean teacher=input.nextBoolean();
		if (teacher==true) {
			if (testAve>homeAve) {
				System.out.println("Your average is " + testAve);
			}
			else {
				System.out.println("Your average is " + homeAve);
			}
			
			}
		else {
				if(testAve>homeAve) {
					System.out.println("Your average is " + homeAve);
				}
				else {
					System.out.println("your average is " + testAve);
				}
		}
	}

}
