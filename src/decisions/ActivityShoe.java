package decisions;

import java.util.Scanner;

public class ActivityShoe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your shoe size? ");
		int shoeSize = input.nextInt();
		System.out.println("what is your height? ");
		int height = input.nextInt();
		System.out.println("height less than 62");
		System.out.println(height < 62);
		System.out.println("shoe size greater than 9");
		System.out.println(shoeSize > 9);

		System.out.println("how many petters you got??? ");
		int pets = input.nextInt();
		System.out.println("What about max amount of cars that can fit it that garage??? ");
		int cars = input.nextInt();
		System.out.println(pets > 5 || cars > 3);
		if (pets > 5) {
			System.out.println("eee");
		} else {
			System.out.println("you tried");
		}
	}
}
