package oOP;
import java.util.Scanner;
public class TestWorker {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Worker james=new Worker();
		System.out.println("Hours: ");james.setHours(input.nextInt());
		System.out.println("pay: ");james.setPay(input.nextDouble());
		System.out.println("Pay: "+ james.getPay());
		System.out.println("hours: " + james.getHours());
		System.out.println("paycheck: " + james.Paycheck());
		System.out.println("How much to raise: ");james.raise(input.nextDouble());
		System.out.println("How much after raise: "+ james.getPay());
		System.out.println("New Paycheck: " + james.Paycheck());
		input.close();

	}

}
