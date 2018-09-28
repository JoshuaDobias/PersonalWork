package mathOpps;
import java.util.Scanner;
public class Age {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("how old are you?");
		int age =input.nextInt();
		age = age + 7;
		System.out.println("in 7 years you will be " + age + " years old");
	}

}
