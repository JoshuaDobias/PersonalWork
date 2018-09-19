package inputExamples;
import java.util.Scanner;
public class MonkeyHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monkeyHeight = 20;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is an adult monkey?");
		monkeyHeight=input.nextInt();
		System.out.println("Monkys are " + monkeyHeight + "feet tall");
	}

}
