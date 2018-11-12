package decisions;
import java.util.Scanner;
public class LuckyNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("how old are you homie");
		int age=input.nextInt();
		if (age>=18) {
			System.out.println("Your height: ");
			double height=input.nextDouble();
			double luckAdult= height*5;
			System.out.println("Your lucky number is "+ luckAdult);
			}
		else {
			System.out.println("weight: ");
			double weight=input.nextDouble();
			double luckKid=weight/2;
			System.out.println("your lucky num is "+luckKid);
		}
	}

}
