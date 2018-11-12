package decisions;

import java.util.Scanner;

public class SalaryActivity {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How much is your salary"); int salary=input.nextInt();
		if (salary<20000) {
			System.out.println("You are a worker");
		}
		else {
			if(salary>=20000&&salary>40000) {
				System.out.println("You are a Manager");
			}
			else {
				if(salary>=40000&&salary<100000) {
					System.out.println("You are a CEO");
				}
				else {
					System.out.println("You are an owner");
				}
			}
		}
	}

}
