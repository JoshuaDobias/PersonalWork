package interfacesandPolymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InstanceOfExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Person> a = new ArrayList<Person>();
		Random gen=new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("Add a Teacher '1' add a Student '2'");
			int choice = input.nextInt();
			if (choice == 1) {
				a.add(new Teacher());
			} else if (choice == 2) {
				a.add(new Student());
			} else {
				System.out.println("incorrect choice reseating count");
				i--;
			}
			if (Person instanceof Student) {
				}
			}
	}

}
