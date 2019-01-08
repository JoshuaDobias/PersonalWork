package interfacesandPolymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CandRAct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Shape> a = new ArrayList<Shape>();
		Random gen=new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("Add a circle '1' add a Rectangle '2'");
			int choice = input.nextInt();
			int randomNum=0 + gen.nextInt(1 - 0 + 1);
			if (choice == 1) {
				a.add(new Circle(randomNum));
			} else if (choice == 2) {
				a.add(new Rectangle(randomNum,randomNum));
			} else {
				System.out.println("incorrect choice reseating count");
				i--;
			}

		}
		for (int i = 0; i < a.size(); i++) {
			Shape test = a.get(i);
			System.out.println("Index"+(i+1));
			System.out.println("area: " + test.area());
			System.out.println("perimeter" + test.perimeter());
			System.out.println();
		}
		double sum=0;
		double min=0;
		for (Shape x:a) {
			sum+=x.perimeter();
			if(x.perimeter()<=min) {
				min=x.perimeter();
			}
		}
		System.out.println("Sum of perimeter="+ sum);
		System.out.println("Min of the perimeter="+min);
	}

}
