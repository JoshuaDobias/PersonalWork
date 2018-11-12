package decisions;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int sum=0;
		while(num>=sum) {
			sum+=num;
			num+=2;
		}
		System.out.println("sum= "+sum);

		int num2=0;
		while (num2<9999) {
		System.out.println("Please enter a number(9999 to quit)");
		num2=input.nextInt();num2=num2*2;
		if (num2>=9999) {
			System.out.println("Quitting");
		}else {
		System.out.println("your number times 2 is:"+ num2); 
		}}
		int num3=input.nextInt();
		int sum2=0;
		while(num3!=9999) {
			sum2=sum2+num3;
			num3=input.nextInt();
		}
		System.out.println(sum2);
		System.out.println("Enter double value: ");
	double value=input.nextDouble();
	double sum3=0;
	int counting=0;
	while (value!=9999) {
		sum3=sum3+value;
		counting++;
		System.out.println("9999 to quit");
		value=input.nextDouble();
		
	}
	double average=sum3/counting;
	System.out.println("Average is " +average);
	}
	
}
