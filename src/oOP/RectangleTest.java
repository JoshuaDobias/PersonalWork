package oOP;
import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Rectangle a=new Rectangle();
		System.out.println("Height of rectangle:");a.setHeight(input.nextDouble());
		System.out.println("Length of rectangle:");a.setLength(input.nextDouble());
		System.out.print("Length: ");System.out.println(a.getHeight());
		System.out.print("Height: ");System.out.println(a.getLength());
		System.out.print("Area: ");System.out.println(a.getArea());
		System.out.print("Perimeter: ");System.out.println(a.getPerimeter());
input.close();
}
}