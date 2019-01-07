package interfacesandPolymorphism;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Length?");
		int length=input.nextInt();
		System.out.println("Width?");
		int width=input.nextInt();
		Rectangle box=new Rectangle(length,width);
		Shape geo=box;

	}

}
