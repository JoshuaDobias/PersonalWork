package arraysWork;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Activity?");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
			System.out.println("how many students are in this class");
			int[] student = new int[input.nextInt()];
			for (int i = 0; i < student.length; i++) {
				System.out.println("age of student " + (i + 1));
				student[i] = input.nextInt();
			}
			double age = 0;
			for (int i : student) {
				age += i;
			}
			double avgAge = age / student.length;
			System.out.println("Average age of students=" + avgAge);
			break;
		case 2:
			ArrayList<Double> wages = new ArrayList<Double>();
			System.out.println("How many employees");
			int employee = input.nextInt();
			for (int i = 0; i < employee; i++) {
				System.out.println("wage of employee");
				wages.add(input.nextDouble());
			}
			double highest = 0;
			for (double worker : wages) {
				if (worker > highest) {
					highest = worker;
				}
			}
			System.out.println("The highest wage " + highest);
			break;
		case 3:
			Circle[] radii = new Circle[10];
			for (int i = 0; i < radii.length; i++) {
				System.out.println("Radii");
				radii[i]=new Circle(input.nextDouble());
			}
			for (Circle x: radii) {
				System.out.println(x.area());
			}
		}

	}
}
