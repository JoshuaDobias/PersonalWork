package decisions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("GPA: ");
		double gpa=input.nextDouble();
		System.out.println("Class: ");
		double grade=input.nextDouble();
		if (grade==12.0 && gpa >= 3.5) {
			System.out.println("you can graduate");
		}
		else {
			System.out.println("you bad, you can't graduate ...also ur mom gay");
		}
		

	}

}
