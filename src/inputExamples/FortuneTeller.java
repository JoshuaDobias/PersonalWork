package inputExamples;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int weight = 0;
		double luckynum=0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Your Fortune shall be told with only 3 pieces of information");
		System.out.println("what is your Age? Your weight? Your lucky number?");
		System.out.print("age:");age=input.nextInt();System.out.println();
		System.out.print("Weight:");weight=input.nextInt();System.out.println();
		System.out.print("Lucky Number:");luckynum=input.nextDouble();System.out.println();
		System.out.println("I SEE IN YOUR FUTURE.......");
		System.out.println("In " + age + 100 + " Years");
		System.out.println("You will be dead");
		
		
	}

}
