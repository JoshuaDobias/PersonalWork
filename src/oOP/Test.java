package oOP;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Employee ron=new Employee();
		Scanner input=new Scanner(System.in);
		System.out.println(ron.getExperience());
		System.out.println("New exp:");
		ron.setExperience(input.nextDouble());
		System.out.println(ron.getExperience());
		System.out.println(ron.getWage());
		ron.getRaise();
		System.out.println(ron.getWage());
	}

}
