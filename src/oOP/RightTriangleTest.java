package oOP;

public class RightTriangleTest {

	public static void main(String[] args) {
		RightTriangle a=new RightTriangle();
		a.setBase(3);
		a.setHeight(4);
		System.out.println("Hypotenuse: " + a.hypotenuse());
		System.out.println("area: " + a.area());
		System.out.println("perimeter: " + a.perimeter());

	}

}
