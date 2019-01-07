package interfacesandPolymorphism;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Length?");
	int length=input.nextInt();
	System.out.println("Width?");
	int width=input.nextInt();
	Shape a=new Rectangle(length,width);
	System.out.println("Area: "+ a.area()+ " Perimeter: "+a.perimeter());
	System.out.println("Radius?");
	double radius=input.nextDouble();
	Shape b=new Circle(radius);
	System.out.println("Area: "+ b.area()+ " Perimeter: "+b.perimeter());
	}

}
