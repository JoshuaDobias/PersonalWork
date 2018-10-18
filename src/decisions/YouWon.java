package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How much money did you get on your fifth birthday?");
		double money=input.nextDouble();
		double epsilon=.1;
		if (Math.abs(money-Math.sqrt(84.3))<epsilon) {
			System.out.println("YOU WON A GREAT PRIZE");
		}
		else {
			System.out.println("YOUR MOM GAY");
		}

	}

}
