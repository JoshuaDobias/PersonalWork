package decisions;
import java.util.Scanner;
public class ActivityAge {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("what is your age: ");int age=input.nextInt();
		System.out.println(16==age);
		System.out.println("First test score?"); int score1=input.nextInt();
		System.out.println("Second test score?"); int score2=input.nextInt();
		if(score1>score2) {
			System.out.println("good job");
		}
	}

}
