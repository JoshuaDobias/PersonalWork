package decisions;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("First 3 integers");
		int first=input.nextInt();
		int second=input.nextInt();
		int third=input.nextInt();
		if (first > second && first>third) {
			System.out.println("First is the largest " + first);
		}
		if (second > first && second>third) {
			System.out.println("second is the largest " + second);
		}
		if (third > first && third>second) {
			System.out.println("third is the largest " + third);
		}
		if (first==second && first==third) {
			System.out.println("they are all the same");
		}
	}

}
