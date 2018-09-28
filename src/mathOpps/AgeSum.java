package mathOpps;
import java.util.Scanner;
public class AgeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How old is the age of your three friends?");
		double age1=input.nextInt();
		double age2=input.nextInt();
		double age3=input.nextInt();
		double sumAge= (age1 + age2 + age3);
		System.out.println("The sum age of your three friends is " + sumAge);
	}

}
