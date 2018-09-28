package mathOpps;

import java.util.Scanner;

public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many post it's would it take to fill a rectaguler wall?");
		System.out.println("Your guess?");
		int guess = input.nextInt();
		System.out.println("Height of the wall to the nearest whole inch?");
		int height = input.nextInt();
		System.out.println("length of the wall to the nearest whole inch?");
		int length = input.nextInt();
		System.out.println("Your guess: " + guess);
		int area = height * length;
		System.out.println("Area of the wall: " + area + " in^2");
		int solution = area / 9;
		System.out.println("Answer: " + solution + " post it notes.");
	}

}
