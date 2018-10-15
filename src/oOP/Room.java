package oOP;

import java.util.Scanner;

public class Room {
	Scanner input = new Scanner(System.in);

	public void area() {
		System.out.println("How height is your wall?");
		int height = input.nextInt();
		System.out.println("How long is your wall?");
		int length = input.nextInt();
		int area = height * length;
		System.out.println("The walls area is " + area);
	}

	public void areaWithDoor() {
		System.out.println("Length and height of wall?");
		System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("height: ");
		int height = input.nextInt();
		System.out.println("length and height of door?");
		System.out.println("length: ");
		int doorLength = input.nextInt();
		System.out.println("Height: ");
		int doorHeight = input.nextInt();
		int area = length * height;
		int doorArea = doorLength * doorHeight;
		int realArea = area - doorArea;
		System.out.println("The walls area without the door is " + realArea);

	}

}
