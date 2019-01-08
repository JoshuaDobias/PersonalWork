package classDesign;

import java.util.ArrayList;
import java.util.Scanner;

public class DesignActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> a = new ArrayList<Greeter>();
		System.out.println("How many greeters would you like");
		int greeters = input.nextInt();
		for (int i = 0; i < greeters; i++) {
			a.add(new Greeter());
			int age=0;
		}
		int i = 0;
		for (Greeter x : a) {
			i++;
			System.out.println("Greeter " + i + " age :");
			System.out.println(x.getAge());
		}
		
		input.close();
	}

}
