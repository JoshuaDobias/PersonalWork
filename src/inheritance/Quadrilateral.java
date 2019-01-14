package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 20.0;
		s2 = 10.0;
		s3 = 12.0;
		s4 = 6.0;
	}

	public Quadrilateral(double xs1, double xs2, double xs3, double xs4) {
		s1 = xs1;
		s2 = xs2;
		s3 = xs3;
		s4 = xs4;
	}

	public void setSide1(double nside) {
		s1 = nside;
	}

	public void setSide2(double nside) {
		s2 = nside;
	}

	public void setSide3(double nside) {
		s3 = nside;
	}

	public void setSide4(double nside) {
		s4 = nside;
	}

	public double getSide1() {
		return s1;
	}

	public double getSide2() {
		return s2;
	}

	public double getSide3() {
		return s3;
	}

	public double getSide4() {
		return s4;
	}

	public double perimeter() {
		double perimeter = s1 + s2 + s3 + s4;
		return perimeter;
	}

}
