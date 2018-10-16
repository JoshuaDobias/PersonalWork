package decisions;
import java.util.Scanner;
public class ActivityShoe {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your shoe size? "); int shoeSize=input.nextInt();
		System.out.println("what is your height? "); int height=input.nextInt();
		int compair=shoeSize+height;
		System.out.println("Are your two values greater than or equal to eachother? "); 
		System.out.println(compair<=26);
	}

}
