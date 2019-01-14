package inheritance;

public class Trapezoid extends Quadrilateral implements Geo {
	private double height = 0;

	public Trapezoid() {
		super(10, 20, 5, 5);
		height = 4;
	}

	public Trapezoid(double top, double bottom, double leftLeg, double rightLeg, double nheight) {
		super(top, bottom, leftLeg, rightLeg);
		height = nheight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double ht) {
		height = ht;
	}

	public double area() {
		double area = 0.5 * (getSide1() + getSide2()) * height;
		return area;
	}

}
