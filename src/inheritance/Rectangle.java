package inheritance;

public class Rectangle extends Parallelogram implements Geo{

	public Rectangle() {
		super();
	}
	public Rectangle(double width,double length) {
		super(length, width,width);
	}

}
