package mathOpps;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Area of your lawn to the nearest whole foot");
		System.out.println("height: ");
		int height = input.nextInt();
		System.out.println("Length: ");
		int length = input.nextInt();
		int area = height * length;
		System.out.println("Radius of Fountain: ");
		int radius = input.nextInt();
		double circle = Math.PI * (radius * radius);
		double cutting = area - circle;
		System.out.println("Lawn area able to cut: " + cutting + "ft^2");
		int close = (int) (cutting / 100);
		double pay = close * 1.25;
		System.out.println("You get $" + pay);
		input.close();
	}

}
