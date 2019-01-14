package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height=0;
	public Parallelogram() {
		super(10,20,10,20);
		height=10;
	}
	public Parallelogram(double base,double leg,double ht) {
		super(base,leg,base,leg);
		height=ht;
	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double ht) {
		height = ht;
	}
	public double area() {
		double area=height*getSide1();
		return area;
	}
}
