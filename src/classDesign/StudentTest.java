package classDesign;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student a=new Student();
		for (int i=0; i<5;i++) {
		System.out.println("enter a test score you would like put into the array");
		double data=input.nextDouble();
		a.addaScore(data);
		}
		System.out.println(a.averageScore());
		System.out.println(a.lowestScore());
		input.close();
}

}
