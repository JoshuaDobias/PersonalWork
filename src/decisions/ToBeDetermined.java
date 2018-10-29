package decisions;
import java.util.Scanner;
public class ToBeDetermined {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter activity number");
		int activity=input.nextInt();
		switch(activity) {
		case 1:
			int num1;
			do {
			System.out.println("Enter an integer");
			num1=input.nextInt();
			int product=num1*17;
			System.out.println(product);
			}while (num1!=9999);
			break;
		case 3:
			System.out.println("Please enter a number");
			int num3=input.nextInt();
			int largeNum3=0;
			int smallNum3=0;
			do {if (num3>largeNum3) {largeNum3=num3;}
			if (num3>smallNum3 && smallNum3<largeNum3) {smallNum3=num3;}
			System.out.println("Enter a number or 9999 to quit");
			num3=input.nextInt();
			}while(num3!=9999);
			int range=largeNum3-smallNum3;
			System.out.println("This is your range "+range);
			break;
		case 5:
			for (int i=0; i<20; i++) {
				System.out.println(i+ "hello world");
				break;
			}
		case 6:
			int total=0;
			for (int counter=1; counter <=10; counter++) {
				total+=counter;
			}
		System.out.println(total);
		case 9:
			int give=0;
			int total9=0;
			for (int count=0; count<5; count++ ) {
				System.out.println("Enter a number");
				give=input.nextInt();
				total9=total9+give;
			}
			System.out.println("Your total is "+total9);
		}
	}

}
