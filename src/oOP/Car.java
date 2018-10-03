package oOP;
import java.util.Scanner;
public class Car {

	public Car() {
	}
	public void sayOdometer() {
		Scanner input=new Scanner(System.in);
		int mile=input.nextInt();
		System.out.println("Your car has " + mile +" miles on it");
	}
	public void sayFlat() {
		System.out.println("The tire is flat!!!");
	}
	public void sayThirsty() {
		System.out.println("This car is out of gas");
	}
}
