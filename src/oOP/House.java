package oOP;
import java.util.Scanner;
public class House {
	Scanner input=new Scanner(System.in);
	public House() {}
	public void paintWall() {
		System.out.println("What is the length of your wall in feet?"); double length=input.nextDouble();
		System.out.println("What is the height of your wall in feet?"); double height=input.nextDouble();
		double area=length*height;
		double time=area/200;
		time=time*60;
		System.out.println("it will take about " +time +" minutes to paint that wall");
	}
}
