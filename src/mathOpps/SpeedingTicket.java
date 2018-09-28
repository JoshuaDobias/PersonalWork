package mathOpps;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How fast is the speed limit?");
		int speed = input.nextInt();
		System.out.println("How fast was the car going");
		int personalS = input.nextInt();
		int ticket = 55;
		ticket = ticket + 40 * (personalS - speed);
		if (personalS < speed)
			ticket = 0;
		System.out.println("Speed Limit " + speed);
		System.out.println("Cars Speed " + personalS);
		System.out.println("Ticket cost " + ticket);

	}

}
