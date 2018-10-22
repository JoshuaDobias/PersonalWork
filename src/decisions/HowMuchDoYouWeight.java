package decisions;

import java.util.Scanner;

public class HowMuchDoYouWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What planet are you on where");
		System.out.println("1 = Mercury");
		System.out.println("2 = Venus");
		System.out.println("3 = Mars");
		System.out.println("4 = Jupiter");
		System.out.println("5 = Saturn");
		Planet choice = new Planet();
		System.out.print("Planet");choice.setPlanet(input.nextInt());
		System.out.println("How much do you weigh");
		choice.setWeight(input.nextInt());
		choice.getPlanet();

	}

}
