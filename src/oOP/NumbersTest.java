package oOP;
import java.util.Scanner;
public class NumbersTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Numbers five=new Numbers();
		five.sayNumber(7.5);
		five.sayNumberPlusTwo(7.5);
		five.saySum(input.nextDouble(), input.nextDouble());
	}

}
