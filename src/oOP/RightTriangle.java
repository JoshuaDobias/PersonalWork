package oOP;

public class RightTriangle {
	private int base;
	private int height;
	public RightTriangle() {}
	public RightTriangle(int base, int height) {
		base=20;
		height=10;
	}
	public void setBase(int bbase) {
		base=bbase;
	}
	public void setHeight(int hhight) {
		height=hhight;
	}
	public double hypotenuse() {
		double a2b2= base*base + height*height;
		double hypotenuse= Math.sqrt(a2b2);
		return hypotenuse;
	}
	public double perimeter() {
		double a2b2=(base*base + height*height);
		double hypotenuse= Math.sqrt(a2b2);
		double perimeter=hypotenuse+height+base;
		return perimeter;
	}
	public int area() {
		int area=(height*base)/2;
		return area;
	}
}
