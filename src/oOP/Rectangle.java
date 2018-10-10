package oOP;

public class Rectangle {
private double length;
		private double height;
		public Rectangle() {
			length=5;
			height=10;
		}
		
		public Rectangle(double newL, double newH) {
			length=newL;
			height=newH;
		}
		
		public double getLength() {
			return length;
		}
		public double getHeight() {
			return height;
		}
		public double getPerimeter() {
			double perimeter=2*(length+height);
			return perimeter;
		}
		public double getArea() {
			double area=length*height;
			return area;
		}
		public void setLength(double nlength) {
			length=nlength;
		}
		public void setHeight(double nheight) {
			height=nheight;
		}
}
